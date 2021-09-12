package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public class AnalyticsCounter {
	/**
	 * Path of the file containing the data to analyze
	 * 
	 * @see ISymptomReader
	 * @see ReadSymptomDataFromFile
	 */
	private String filePatch;
	/**
   	 * Initialization of the list which will store the data of the read file
	 * 
	 * @see ISymptomReader
	 */
	private List<String> symptomsList;

	/**
	 * An implementation that groups together the functions that will be executed by the program
	 * 
	 * @param filePatch It is the source file that is to be analyzed
	 * 
	 * 
	 * @throws IOException
	 */
	public void start(String filePatch) throws IOException {

		this.filePatch = filePatch;

		reading();
		counting();
		sorting();
		writing();
	}

	private void reading() {
		/**
		 * method which reads the source file through a previous implementation
		 * 
		 * @see ReadSymptomDataFromFile
		 */
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(filePatch);
		symptomsList = readSymptomDataFromFile.GetSymptoms();
	}

	private void counting() {
		// TODO Auto-generated method stub

	}

	private void sorting() {
		// TODO Auto-generated method stub

	}

	private void writing() {
		// TODO Auto-generated method stub

	}

}
