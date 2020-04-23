package com.example.day9.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<Integer>();
		
		//List<Integer> aList = Arrays.asList(1,1,2,3,4,5,6,6);
		
		//HashSet does not guarantee ordering
		hashSet.addAll(Arrays.asList(1,1,2,3,4,5,6,6,-1,-2,0,32,1000,99,-3,-99));
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		//TreeSet gives natural order to its values
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.addAll(hashSet);
		System.out.println(treeSet);
		
		
	}

}
