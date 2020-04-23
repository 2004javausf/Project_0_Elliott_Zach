package com.example.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.example.model.CreatureCard;

public class CreatureCardDaoImpl implements CreatureCardDao {
	
	private String url = "jdbc:postgresql://revaturetraining.czoyomajnrel.us-east-2.rds.amazonaws.com:5432/magicdb";
	private String username = "planeswalker";
	private String password = "Passw0rd";
	

	@Override
	public List<CreatureCard> getAllCards() {
		List<CreatureCard> cardList = new ArrayList<CreatureCard>();
		try {
			//one of the three statements we can create using the connection interface is statement.
			//Statement is raw SQL, with no pre-compiler therefore it is prone to SQL injection
			Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
			String sql = "select*from creature_cards";
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
			
			while(rs.next()) {
				cardList.add(new CreatureCard(rs.getString(1),rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), null));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cardList;
	}

	@Override
	public CreatureCard getCardByName(String name) {
		CreatureCard card = null;
		try {
			//prepared statement can hold raw SQL, but it is precompiled on the java side before being sent to the SQL DB, this 
			//prevents SQL injection
			Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
			String sql = "select * from creature_cards c left outer join creature_junction_color cjc on c.name = cjc.c_name \r\n" + 
					"left outer join color co on cjc.color_id = co.id where c.name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			List<String> colorList = new ArrayList<String>();
			while(rs.next()) {
				card = new CreatureCard(rs.getString(1),rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), null);
				colorList.add(rs.getString(9));
			}
			card.setColorList(colorList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return card;
	}

	@Override
	public void updateCard(CreatureCard card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCard(CreatureCard card) {
		try {
			//Callable Statement allows us to call stored function in our SQL DB this also prevents SQL injection because it is
			//also precompiled
			Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
			
			String sql = "{? = call creature_insert(?,?,?,?,?)}";
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.setString(2, card.getName());
			cs.setInt(3, card.getManaCost());
			cs.setString(4, card.getCreatureType());
			cs.setInt(5, card.getPower());
			cs.setInt(6, card.getToughness());
			
			cs.execute();
			
			System.out.println(cs.getString(1));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCard(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertJunction(String name, int color) {
		
		Connection conn;
		try {
			conn = DriverManager.getConnection(this.url, this.username, this.password);
			String sql = "insert into creature_junction_color values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, color);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
