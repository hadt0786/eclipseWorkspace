package com.practise.collection.CollectionPractise.ArrayList._11;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to extract a portion of a array list.
 * 
 * 
 * @author zibtek
 *
 */
public class ArrayList12 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l.add(i);
		}

		List<Integer> l1 = l.subList(2, 30);
		System.out.println(l1);

	}

}
