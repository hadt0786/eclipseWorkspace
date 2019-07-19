package com.practise.collection.CollectionPractise.ArrayList._10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * Write a Java program to shuffle elements in a array list.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList10 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for (Integer i = 0; i < 100; i++) {
			l.add(i);
		}
		Collections.shuffle(l);
	}

}
