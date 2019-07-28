package com.fileSystem.FileExample._01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

public class FileExample {

	public static void main(String[] args) throws IOException {

		/*
		 * Write a Java program to get a list of all file/directory names from the
		 * given.
		 * 
		 */
		File myDir = new File("/home/zibtek/Downloads");
		File file = new File("/home/zibtek/Downloads");

		String[] fileList = file.list();

		for (String name : fileList) {
			System.out.println(name);
		}

		/*
		 * Write a Java program to get specific files by extensions from a specified
		 * folder.
		 */

		String[] list = file.list(new FilenameFilter() {

			public boolean accept(File arg0, String arg1) {

				if (arg1.toLowerCase().endsWith(".txt")) {
					return true;
				} else {
					return false;
				}

			}
		});
		for (String f : list) {
			System.out.println("extension file " + f);
		}

		/*
		 * Write a Java program to check if a file or directory specified by pathname
		 * exists or not.
		 * 
		 * 
		 */

//		File myDir = new File("/home/zibtek/Downloads");
		if (myDir.exists()) {
			System.out.println("the directory exists");
		} else {
			System.out.println("does not exists");
		}

		/*
		 * Write a Java program to check if a file or directory has read and write
		 * permission.
		 * 
		 */

		if (myDir.canWrite()) {
			System.out.println(myDir.getAbsolutePath() + "can write");
		} else {
			System.out.println(myDir.getAbsolutePath() + " can not write");
		}
		if (myDir.canRead()) {
			System.out.println(myDir.getAbsolutePath() + " can read ");
		} else {
			System.out.println(myDir.getAbsolutePath() + " cannot read");
		}

		/*
		 * Write a Java program to compare two files lexicographically.
		 * 
		 * 
		 */

		String str1 = "Java exercises";
		String str2 = "Java exercises";
		String str3 = "Java examples";

		int var1 = str1.compareTo(str2);
		System.out.println("str1 & str2 comparison: " + var1);

		int var2 = str1.compareTo(str3);
		System.out.println("str1 & str3 comparison: " + var2);

		/*
		 * Write a Java program to get last modified time of a file.
		 * 
		 * 
		 */

		File newFile = new File("/home/zibtek/Downloads/CSVHistorical NOCP 1y.csv");
		Date date = new Date(newFile.lastModified());
		System.out.println("last modified " + date);

		/*
		 * Write Java program to read input from java console.
		 * 
		 * 
		 */

//		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Input your name");
//		String name = cin.readLine();
//		System.out.println("your name is " + name);

		/*
		 * Write a Java program to get file size in bytes, kb, mb.
		 * 
		 * 
		 */

		if (newFile.exists()) {
			System.out.println(filesize_in_Bytes(file));
			System.out.println(filesize_in_kiloBytes(file));
			System.out.println(filesize_in_megaBytes(file));
		} else
			System.out.println("File doesn't exist");

		/*
		 * Write a Java program to read contents from a file into byte array.
		 * 
		 * 
		 */

		String filename = "/home/zibtek/Downloads/CSVHistorical NOCP 1y.csv";
		InputStream fins = null;

		try {
			fins = new FileInputStream(filename);
			byte file_content[] = new byte[2 * 1024];
			int read_count = 0;
			while ((read_count = fins.read(file_content)) > 0) {
				System.out.println(new String(file_content, 0, read_count));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fins != null)
					fins.close();
			} catch (Exception ex) {

			}
		}

		/*
		 * Write a Java program to read a file content line by line.
		 * 
		 * 
		 */

		BufferedReader br = null;
		String line = "";
		try {
			br = new BufferedReader(new FileReader(
					"/home/zibtek/Downloads/Fri Jul 05 2019 12_29_42 GMT+0530 (India Standard Time).csv"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read file ");
		}

		/*
		 * Write a Java program to read a plain text file.
		 * 
		 * 
		 */

		StringBuilder sb = new StringBuilder();
		String newLine = "";
		try {
			BufferedReader b = new BufferedReader(new FileReader(
					"/home/zibtek/Downloads/Fri Jul 05 2019 12_29_42 GMT+0530 (India Standard Time).csv"));
			while (newLine != null) {
				sb.append(newLine);
				sb.append(System.lineSeparator());
				newLine = b.readLine();
				System.out.println(newLine);
			}

			/*
			 * Write a java program to read a file line by line and store it into a
			 * variable.
			 * 
			 * 
			 */

			System.out.println("read line by line and store it into a new variable");
			String str_data = "";
			while (newLine != null) {
				if (newLine == null) {
					break;
				}
				str_data += newLine;
				newLine = b.readLine();

			}
			System.out.println(str_data);

			b.close();

		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read file ");
		}
	}

	private static String filesize_in_megaBytes(File file) {
		return (double) file.length() / (1024 * 1024) + " mb";
	}

	private static String filesize_in_kiloBytes(File file) {
		return (double) file.length() / 1024 + "  kb";
	}

	private static String filesize_in_Bytes(File file) {
		return file.length() + " bytes";
	}

}
