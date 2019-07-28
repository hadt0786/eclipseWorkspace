package com.fileSystem.FileExample._01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader14 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String line = "";
		List<String> list = new ArrayList<String>();

		try (BufferedReader b = new BufferedReader(new FileReader(
				"/home/zibtek/Downloads/Fri " + "Jul 05 2019 12_29_42 GMT+0530 " + "(India Standard Time).csv"))) {
			while (line != null) {
				line = b.readLine();
				sb.append(line);
				sb.append(System.lineSeparator());
				line = b.readLine();
				if (line == null) {
					break;
				}
				list.add(line);
			}
			System.out.println(Arrays.deepToString(list.toArray()));

		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}

	}

}
