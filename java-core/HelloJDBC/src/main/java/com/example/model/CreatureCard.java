package com.example.model;

import java.util.List;

public class CreatureCard {
	
	private String name;
	private int manaCost;
	private String creatureType;
	private int power;
	private int toughness;
	private List<String> colorList;
	
	public CreatureCard() {
		
	}

	public CreatureCard(String name, int manaCost, String creatureType, int power, int toughness,
			List<String> colorList) {
		super();
		this.name = name;
		this.manaCost = manaCost;
		this.creatureType = creatureType;
		this.power = power;
		this.toughness = toughness;
		this.colorList = colorList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getManaCost() {
		return manaCost;
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	public String getCreatureType() {
		return creatureType;
	}

	public void setCreatureType(String creatureType) {
		this.creatureType = creatureType;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public List<String> getColorList() {
		return colorList;
	}

	public void setColorList(List<String> colorList) {
		this.colorList = colorList;
	}

	@Override
	public String toString() {
		return "CreatureCard [name=" + name + ", manaCost=" + manaCost + ", creatureType=" + creatureType + ", power="
				+ power + ", toughness=" + toughness + ", colorList=" + colorList + "]";
	}
}
