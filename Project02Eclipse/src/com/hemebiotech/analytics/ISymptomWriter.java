package com.hemebiotech.analytics;

import java.io.FileWriter;

/**
 * This is an implementation for writing text files. it returns a value in a
 * text file which will be saved in the package.
 *
 * This file will contain a list of character strings.
 * 
 */
public interface ISymptomWriter {
	/**
	 * If no data is available, returns an empty file
	 * 
	 * @return a file containing the symptoms and their occurrences in alphabetical
	 *         order, collected in a Map
	 * 
	 */
	FileWriter symptomsSaver();

}
