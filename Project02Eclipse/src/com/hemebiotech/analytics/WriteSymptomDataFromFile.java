package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This class is implemented to instantiate <strong> ISymptomWriter </strong>.
 * It records the result obtained at the end of the reading and counting of
 * occurrences of another file (.txt); which has been collected in a List
 * 
 * 
 */
public class WriteSymptomDataFromFile implements ISymptomWriter {

	/**
	 * Collection (k, v) which supported by <strong> WriteSymptomDataFromFile
	 * </strong> and which contains a result to be provided as a file
	 * 
	 * @see WriteSymptomDataFromFile
	 */
	private Map<String, Integer> symptomsFileMap;

	/**
	 * A simple implementation that allows you to take a collection as a parameter
	 * 
	 * @param symptomsFileMap a collection k=String, v=Integer
	 */
	public WriteSymptomDataFromFile(Map<String, Integer> symptomsFileMap) {
		this.symptomsFileMap = symptomsFileMap;
	}

	@Override
	public FileWriter symptomsSaver() {
		FileWriter symptomsResultSaver = null;

		if (symptomsFileMap != null) {

		}
		try {
			symptomsResultSaver = new FileWriter("result.out");
			symptomsResultSaver.write("Symptom data from file : \n");

			for (Map.Entry<String, Integer> symptomDataMap : symptomsFileMap.entrySet()) {

				Integer value = symptomDataMap.getValue();
				String key = symptomDataMap.getKey();

				symptomsResultSaver.write(key + " = " + value + "\n");
			}

			symptomsResultSaver.close();

		}

		catch (IOException e) {
			System.err.println("File contents unreadable");
		}

		return symptomsResultSaver;

	}

}
