package com.example.week1.threading;

/*
 * To create a custom thread we must first create a class that either extends the Thread class or implements 
 * the runnable interface. In both cases we must Override the run method. In the case of extending we now just call the 
 * start method 
 * 
 * In the case of implements we create a thread object with the custom runnable object as the argument
 * and then call that thread's start method
 * 
 * Extends vs Implements
 * Pros of extending:
 * -less actual time spent on implementing methods 
 * -receive all methods and fields associated with the extended class
 * Pros of Implementing 
 * -Does not use up your single extends slot, so you can extend another class 
 * -Lightweight, you do not get all the excess methods and fields if you don't plan on using them
 */

public class CustomThreadExample {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		//myThread.run(); //This method is just a normal method , the custom thread
		//MyThread hasn't actually be started
		myThread.start(); //starts and creates a new thread, then it invokes the run()
		for(int i =0;i<40;i++) {
			System.out.println(Thread.currentThread().getName());
		}

		MyRunnable myrun = new MyRunnable();
		Thread th = new Thread(myrun);//The Thread class has a constructor that take an
		//object of type runnable as its argument and invokes its run method
		th.start();
	}

}
