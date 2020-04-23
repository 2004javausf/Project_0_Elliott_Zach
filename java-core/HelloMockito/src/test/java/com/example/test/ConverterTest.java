package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.example.converter.Converter;
import com.example.converter.ConverterHelperService;

public class ConverterTest {
	
	Converter conv;
	ConverterHelperService helpServ = Mockito.mock(ConverterHelperService.class);
	
	@Before
	public void setUp() throws Exception{
		conv = new Converter(helpServ);
	}
	
	@Test
	public void howManyFeetTest() {
		//trigger mockito
		Mockito.when(helpServ.findMilesToFeet()).thenReturn(5280);
		
		assertEquals("How many feet Test", 8*5280, conv.howManyMiles(8));
	}

}
