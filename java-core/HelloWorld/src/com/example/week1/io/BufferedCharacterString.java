package com.example.week1.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharacterString {

	public static void main(String[] args) {
		
		String filename = "./BufferedCharacterStream.txt";
		
		writeBufferedStream(filename);
		readBufferedStream(filename);

	}
	
	static void readBufferedStream(String filename) {
		try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
			
			String line = "";
			
			while((line = reader.readLine())!=null){
				System.out.println(line);
			}
			
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	static void writeBufferedStream(String filename) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
			writer.write("Hello World\n");
			writer.write("again for the 7000th time\n");
			writer.write("Buffered Readers are more effcient and faster at" + " larger pieces of information");
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
