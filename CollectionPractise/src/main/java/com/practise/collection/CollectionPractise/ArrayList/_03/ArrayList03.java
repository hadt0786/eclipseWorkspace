package com.practise.collection.CollectionPractise.ArrayList._03;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a Java program to insert an element 
 * into the array list at the first position.


 * @author zibtek
 *
 */


public class ArrayList03 {
	
public static void main(String[] args) {
	
	List <String > l = new ArrayList<>();
	
	l.add("1");
	l.add("2");
	l.add("3");
	l.add("4");
	l.add("5");
	l.add("6");
	
	System.out.println(l+" before adding ");
	l.add(0, "first");
	l.add(l.size(), " last ");
	
	System.out.println(l+ " after ");
	
	
	
	
	}

}
 