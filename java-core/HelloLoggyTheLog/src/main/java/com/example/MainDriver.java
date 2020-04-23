package com.example;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MainDriver {
	
	/*
	 * Logging allows us to record runtime information in a separate location
	 * this allows us to view this runtime information after the
	 * application has been shutdown 
	 * 
	 * LOGGING LEVELS
	 * 
	 * (low priority)						(highest priority)
	 * ALL < debug < info < warn < error < fatal < off
	 */
	
	final static Logger logger = Logger.getLogger(MainDriver.class);
	
	public static void main(String[] args) {
		
		logger.setLevel(Level.ALL);
		
		logger.warn("This is a warning: it comes at night");
		logger.error("This is an error: pineapples on pizza", new IndexOutOfBoundsException());
		logger.fatal("This is fatal...like the DBZ live action movie");
		logger.info("----------");
		
	}

}
