package com.example.converter;

public class Converter {
	
	public int i = 0;
	
	ConverterHelperService helpServ;
	
	public Converter(ConverterHelperService helpServ) {
		this.helpServ = helpServ;
	}
	
	public int howManyMiles(int miles) {
		return miles*helpServ.findMilesToFeet();
	}
	

}
