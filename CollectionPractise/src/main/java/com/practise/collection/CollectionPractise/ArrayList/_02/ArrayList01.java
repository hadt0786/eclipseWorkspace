package com.practise.collection.CollectionPractise.ArrayList._02;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in a array list.


 * 
 * */



public class ArrayList01 {
	
	public void printAll(List<String> l) {
		for(String s : l) {
			System.out.println(s);
		}
	}
	

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("1");
		l.add("@");
		
		ArrayList01 l1 = new ArrayList01();
		l1.printAll(l);
	}

}
