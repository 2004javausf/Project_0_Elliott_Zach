package com.example.week1.threading;

public class ThreadingExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread th = new Thread();
		//This does not execute a new process
		
		//We can grab the reference to the current thread we are inside of
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		
		//Daemon Thread is a background process, the JVM doesn't care if its
		//still running if the JVM is exiting it will kill it. Has the lowest priority 
		
		System.out.println(mainThread.isDaemon());
		
		//The main thread will enter a time waiting state
		mainThread.sleep(3000);
		
		System.out.println(mainThread.getPriority());

	}

}
