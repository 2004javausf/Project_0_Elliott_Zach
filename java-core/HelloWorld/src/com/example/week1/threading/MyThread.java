package com.example.week1.threading;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		//This method is the entry point to our thread's/process's logic it is similar to
		//the main thread's main method
		
		for(int i = 0; i<40; i++) {
			System.out.println("\t" + Thread.currentThread().getName());
		}
	}

}
