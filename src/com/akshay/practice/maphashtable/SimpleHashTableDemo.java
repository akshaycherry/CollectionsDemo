package com.akshay.practice.maphashtable;

import java.util.Hashtable;
import java.util.Map;

public class SimpleHashTableDemo {
	
	public static void main(String args[]) {
		Map<String,University> hashtable = new Hashtable();
		
		Student student1 = new Student(25,"akshay");
		Student student2 = new Student(20,"vinaya");
		Student student3 = new Student(1,"snigdha");
		Student student4 = new Student(100,"sruchii");
		Student student5 = new Student(400,"anirudh");
		
		
		
		University university1 = new University("SUNY",314498,student1);
		University university2 = new University("cincinnatti",34567,student2);
		University university3 = new University("CSU",123456,student3);
		University university4 = new University("texas",7766554,student4);
		University university5 = new University("florida",7766554,student4);
		University university6 = new University("SUNY",314498,student1);
		
		hashtable.put("university3 ", university3);
		hashtable.put("university4 ", university4);
		hashtable.put("university1 ", university1);
		hashtable.put("university2 ", university2);
		hashtable.put("university5 ", university3);
		hashtable.put("university6 ", university2);
		//hashtable.put("university5 ", null);
		//linkedHashMap.put(null, university6);
		//linkedHashMap.put(null, university5);
		//linkedHashMap.put("university6 ", null);
		
		
		
		//hashMap.put("university6 ", null);
		//hashMap.put(null, university5);
		//hashMap.put(null, university6);
		//hashMap.put(null, null);
		
		System.out.println("size : " + hashtable.size());
		
		System.out.println("==========================");
		
		System.out.println(hashtable);
		
		/*System.out.println("==========================");
		
		
		Set<String> keys = linkedHashMap.keySet();
		
		Iterator<String> i = keys.iterator();
		
		while(i.hasNext()) {
			String k = i.next();
			System.out.println(linkedHashMap.get(k));
			
			System.out.println("=============foreach");
			linkedHashMap.forEach((key, value) -> {System.out.println(key); System.out.println(value);});
		}
		*/
	}

}
