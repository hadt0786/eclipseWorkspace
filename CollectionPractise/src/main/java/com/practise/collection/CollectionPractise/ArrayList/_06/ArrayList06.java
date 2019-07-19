package com.practise.collection.CollectionPractise.ArrayList._06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * Write a Java program to remove the third element from a array list.


 * @author zibtek
 *
 */



public class ArrayList06 {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		
		for(Integer i =0; i< 100 ; i++) {
			l.add(i);
		}
		System.out.println(l + " before removing");
		l.remove(2);
		Collections.shuffle(l);
		System.out.println(l + " before removing");

		Collections.sort(l);
		System.out.println(l + " after removing");

		
		
		
	}

}
