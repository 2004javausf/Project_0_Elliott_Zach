package com.example.week1.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) {
		
		/*
		 * We define a filename in one location so we can pass to the methods
		 * that need to use it, therefore we reduce redundancy and update anomaly
		 * 
		 * this follows the principle of D.R.Y.
		 * Don't 
		 * Repeat
		 * Yourself
		 */
		
		String filename = "./charExample.txt";
		
		writeCharacterStream(filename);
		readCharacterStream(filename);

	}
	
	static void readCharacterStream(String filename) {
		
		try(FileReader reader = new FileReader(filename)){
			int i;
			while((i=reader.read())!=-1) {
				System.out.println((char)i);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	static void writeCharacterStream(String filename) {
		
		//the boolean value in the constructor of the FileWriter is for appending 
		//to the file or not, if false it will overwrite the whole file.
		
		try(FileWriter writer = new FileWriter(filename, true)){
			
			for (int i = 65;i<72;i++) {
				writer.write(i);
			}
			
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
