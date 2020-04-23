package com.example.dao;

import java.util.List;

import com.example.model.CreatureCard;

public interface CreatureCardDao {
	
	public List<CreatureCard> getAllCards();
	
	public CreatureCard getCardByName(String name);
	
	public void updateCard(CreatureCard card);
	
	public void insertCard(CreatureCard card);
	
	public void deleteCard(String name);
	
	public void insertJunction(String name, int color);
		

}
