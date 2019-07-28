package com.fileSystem.FileExample._01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader15 {

	/*
	 * Write a Java program to write and read a plain text file.
	 * 
	 * 
	 */

	public static void main(String a[]) {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		try {
			String filename = "/home/zibtek/Downloads/Fri " + "Jul 05 2019 12_29_42 GMT+0530 " + "(India Standard Time).csv";
			FileWriter fw = new FileWriter(filename, false);
			// appends the string to the file
			fw.write("Python Exercises\n");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("/home/students/myfile.txt"));
			// read the file content
			while (strLine != null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine = br.readLine();
				System.out.println(strLine);
			}
			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

}
