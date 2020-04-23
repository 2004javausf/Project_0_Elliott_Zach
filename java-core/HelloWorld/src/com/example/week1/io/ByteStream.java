package com.example.week1.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStream {

	public static void main(String[] args) {
		
		String filename = "./ByteFile.txt";
		//writeByteStream(filename);
		//readByteStream(filename);
		readThisClassFile();

	}
	static void readByteStream(String filename) {
		
		try(FileInputStream in = new FileInputStream(filename)){
			int i;
			while((i=in.read())!=-1) {
				System.out.println(i+ " ");
			}
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void writeByteStream(String filename) {
		
		//This is "try with resources" automatically close a resource when it is done being used
		
		//this is done with a set of parenthesis after the keyword,
		//the parenthesis only accepts an object of type "AutoClosable" or the descendants of AutoClosable
		
		//one of the purposes of a finally block is to close resources 
		//closing a resource itself requires another try catch
		
		try(FileOutputStream outs = new FileOutputStream(filename)){
			outs.write(65);
			outs.write(66);
			outs.write(200);
			outs.write(300);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	static void readThisClassFile() {
		String filename = "./bin/com/example/week1/io/ByteStream.class";
		
		try(InputStream inputs = new FileInputStream(filename)){
			byte[] first4 = new byte[4];
			inputs.read(first4);
			for(byte b: first4) {
				System.out.println(Integer.toHexString(b).substring(6));
			}
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
