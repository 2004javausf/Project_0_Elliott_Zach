package com.example.day9.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		//The first index is still 0
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(20);
		arrayList.add(100);
		arrayList.add(130);
		
//		System.out.println(arrayList); //arrayList has an overridden toString()
//		System.out.println(arrayList.get(3));
		System.out.println(arrayList.get(arrayList.size()-1));
//		System.out.println(arrayList.get(77));
//		
		
		//Linked List
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Hello");
		linkedList.add("Goodbye");
		linkedList.add("Whats up");
		
		linkedList.addAll(Arrays.asList("Hello", "GoodBye", "Sup"));
		
//		System.out.println(linkedList);
//		System.out.println(linkedList.size());
		
		//Iterators
		ListIterator<Integer> listIterator = arrayList.listIterator();
		
//		while(listIterator.hasNext()) {
//			System.out.print(listIterator.next()+ " ");
//			
//		}
		System.out.println("");
	
		for(Integer i: arrayList) {
			System.out.println(i-2);
		}
		
		//index backwards
		ListIterator<Integer> listIterator2 = arrayList.listIterator(arrayList.size());
		
		while(listIterator2.hasPrevious()) {
			System.out.print(listIterator2.previous()+" ");
		}
		
	}

}
