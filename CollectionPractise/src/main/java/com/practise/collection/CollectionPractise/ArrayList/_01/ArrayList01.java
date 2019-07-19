package com.practise.collection.CollectionPractise.ArrayList._01;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a Java program to create a new array list, 
 * add some elements (string) and print out the collection.


 * 
 * */

public class ArrayList01 {
	
	public void print() {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("2");
		
		System.out.println(list.toString());
		
	}
	
	public static void main(String[] args) {
		ArrayList01 t = new ArrayList01();
		t.print();
	}

}
