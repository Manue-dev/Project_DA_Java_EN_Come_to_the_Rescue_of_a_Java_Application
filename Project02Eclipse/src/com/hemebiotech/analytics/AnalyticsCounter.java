package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
	private Map<String, Integer> symptomsMap = new HashMap<String, Integer>();

	/**
	 * An implementation that groups together the functions that will be executed by
	 * the program
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

	/**
	 * method which analyzes the file while counting the occurrences of the data
	 * read. It stores them in a collection (k, v), providing a result as follows:
	 * <br/>
	 * symptom = occurrence
	 * 
	 */
	private void counting() {

		Iterator<String> iterator = symptomsList.iterator();

		System.out.println("Symptoms data from file :");

		while (iterator.hasNext()) {
			String symptom = iterator.next();

			if (symptomsMap != null && symptomsMap .containsKey(symptom)) {
				symptomsMap.put(symptom, (symptomsMap.get(symptom) + 1));
			}

			else {
				symptomsMap.put(symptom, 1);
			}
		}
	}

	private void sorting() {
		// TODO Auto-generated method stub

	}

	private void writing() {
		// TODO Auto-generated method stub

	}

}
