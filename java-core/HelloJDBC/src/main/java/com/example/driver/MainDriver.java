package com.example.driver;

import java.util.Arrays;
import java.util.List;

import com.example.dao.CreatureCardDaoImpl;
import com.example.model.CreatureCard;

public class MainDriver {

	public static void main(String[] args) {
		
		CreatureCardDaoImpl cCDI = new CreatureCardDaoImpl();
		//System.out.println(cCDI.getAllCards());
		
		//System.out.println(cCDI.getCardByName("Sen Triplets"));
		
		List<String> colorList = Arrays.asList("White", "Blue", "Black", "Red", "Green");
		
		CreatureCard card = new CreatureCard("Sliver Queen", 5, "Sliver", 7, 7, colorList);
		//cCDI.insertCard(card);
		System.out.println(cCDI.getAllCards());
		
//		for(String color: colorList) {
//			if(color.equals("White")) {
//				cCDI.insertJunction(card.getName(), 1);
//			}
//			
//			else if(color.equals("Blue")) {
//				cCDI.insertJunction(card.getName(), 2);
//			}
//			
//			else if(color.equals("Black")) {
//				cCDI.insertJunction(card.getName(), 3);
//			}
//			
//			else if(color.equals("Red")) {
//				cCDI.insertJunction(card.getName(), 4);
//			}
//			
//			else if(color.equals("Green")) {
//				cCDI.insertJunction(card.getName(), 5);
//			}
//			
//			else {
//				System.out.println("Sucks to Suck");
//			}
//		}
		System.out.println(cCDI.getCardByName("Sliver Queen"));
	}

}
