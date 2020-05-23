package com.akshay.practice.maphash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SimpleHashMapDemo {
	public static void main(String args[]) {
		Map<String,University> hashMap = new HashMap();
		
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
		
		
		hashMap.put("university1 ", university1);
		hashMap.put("university2 ", university2);
		hashMap.put("university3 ", university3);
		hashMap.put("university4 ", university4);
		hashMap.put("university5 ", university3);

		//hashMap.put("university5 ", null);
		//hashMap.put("university6 ", null);
		//hashMap.put(null, university5);
		//hashMap.put(null, university6);
		//hashMap.put(null, null);
		
		System.out.println("size : " + hashMap.size());
		
		System.out.println("==========================");
		
		System.out.println(hashMap);
		
		System.out.println("==========================");
		
		/*Set<Entry<String,University>> keys = hashMap.entrySet();
		
		Iterator<Entry<String, University>> i = keys.iterator();
		
		while(i.hasNext()) {
			Entry<String, University> key = i.next();
			System.out.println(hashMap.get(key));
			}*/
		
		    Set<String> keys = hashMap.keySet();
		    Iterator<String> k = keys.iterator();
		    while(k.hasNext()) {
		    	String s = k.next();
		    	System.out.println(hashMap.get(s));
		    }
		    
		    System.out.println("==========================");
		    
		    hashMap.forEach( (key,value) -> { System.out.println(key);System.out.println(value);});
		    
		   
	}

}
