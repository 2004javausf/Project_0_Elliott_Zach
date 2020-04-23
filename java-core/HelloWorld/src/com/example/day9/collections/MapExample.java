package com.example.day9.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String>hashMap = new HashMap<>();
		
		hashMap.put("Food", "Bagel");
		hashMap.put("Drink", "Coffee");
		//hashMap.put(3, "Liam");
		//hashMap.put(4, "Jesus");
		//hashMap.put(6, "Jayson");
		//hashMap.put(10, "Neel2020");
		//hashMap.put(null, null);
		//hashMap.put(77, null);
		//hashMap.put(null, "Eric");
		
		System.out.println(hashMap);
		//System.out.println(hashMap.get(0));
		//System.out.println(hashMap.keySet());
		//System.out.println(hashMap.get(155));
		
		//Map<Integer, String> treeMap = new TreeMap<>();
		//treeMap.putAll(hashMap);
		
		//System.out.println(treeMap);
		
		//Map<Integer, Map<Integer, String>> hashMap2 = new HashMap<>();
		//hashMap2.put(1, hashMap);
		//hashMap2.put(2, treeMap);
		//hashMap2.put(3, hashMap2);
		
		//System.out.println(hashMap2);
		
	}

}
