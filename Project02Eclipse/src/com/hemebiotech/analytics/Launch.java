package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * Simple implementation that serves as a program launcher
 * 
 */
public class Launch {

	private static String filePacth = "/Users/emmanuel/git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";

	/**
	 * main method. It is with her that the program begins
	 * 
	 * @param args
	 * @throws IOException if file not found
	 * 
	 */
	public static void main(String args[]) throws IOException {

		/**
		 * Simple initialization of the variable which will call the method which groups
		 * together the functions to be executed
		 * 
		 * @see AnalyticsCounter
		 */
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.start(filePacth);

	}

}
