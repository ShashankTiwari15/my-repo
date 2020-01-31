package com.pp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		logger.trace("This is trace msg");
		logger.info("This is information msg");
		logger.error("This is error msg");
		logger.warn("This is warning msg");
		logger.fatal("This is fatal msg");
		
		System.out.println("Completed");
		
	

	}

}
