package com.practise.collection.CollectionPractise.ArrayList._05;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a Java program to update specific array element by given element.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList05 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l.add(i);
		}

		l.set(1, 55555);
		System.out.println(l.get(1));
		
		for(Integer i =0 ;i<100 ; i++) {
			l.set(i, 2);
		}
		System.out.println(l);

	}

}
