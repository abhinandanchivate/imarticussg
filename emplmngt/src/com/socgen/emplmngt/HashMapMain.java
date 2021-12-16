package com.socgen.emplmngt;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapMain {

	public static void main(String[] args) {

		Map<Integer, Integer> hashMap = new TreeMap<>();

//		hashMap.put(-50, "abhi");
//		hashMap.put(1000, "java");
//		hashMap.put(20, "imarticus");
//		hashMap.put(10, "advik");
//		hashMap.put(-1, "abhinandan");
		hashMap.put(10, 100);
		hashMap.put(1, 400);
		hashMap.put(null, 0);

		System.out.println(hashMap);
		
		for (Entry<Integer, Integer> e : hashMap.entrySet()) {
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
//		System.out.println(hashMap.containsKey(10));
//		
//		System.out.println(hashMap.containsValue(400));
//		Integer s = hashMap.get(-500);
//
//		System.out.println(s);

	}
}
