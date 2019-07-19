package com.practise.collection.CollectionPractise.ArrayList._04;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element 
 * (at a specified index) from a given array list.


 * @author zibtek
 *
 */



public class ArrayList04 {
	
	

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		for(Integer i = 0 ; i< 100; i++) {
			l.add(i);
		}
		
		System.out.println(l.get(8)+ " " +l.get(10) + " " +l.get(0)+ " "
		+l.get(l.size()-1));
		
		
		
	}

}
