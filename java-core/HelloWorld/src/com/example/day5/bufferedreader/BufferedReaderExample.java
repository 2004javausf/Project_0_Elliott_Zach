package com.example.day5.bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		
		
		//The BufferReader can handle larger sizes(8k) scanner can only handle(1k) and is faster. 
		//However it can only read data and cannot parse 
		//it is synchronized aka thread safe
		//built in checked exceptions
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter your name");
		String name = reader.readLine();
		System.out.println(name);

	}

}
