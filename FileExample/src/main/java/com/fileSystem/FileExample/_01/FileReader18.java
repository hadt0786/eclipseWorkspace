package com.fileSystem.FileExample._01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader18 {
	/*
	 * Write a Java program to find the longest word in a text file.
	 * 
	 * 
	 */

	public static void main(String[] args) throws FileNotFoundException {
		new Exercise18().findLongestWords();
	}

	public String findLongestWords() throws FileNotFoundException {

		String longest_word = "";
		String current;
		Scanner sc = new Scanner(new File("/home/students/test.txt"));

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longest_word.length()) {
				longest_word = current;
			}

		}
		System.out.println("\n" + longest_word + "\n");
		return longest_word;
	}

}
