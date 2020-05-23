package com.akshay.practice.maplinkedhash;

import java.util.LinkedHashMap;
import java.util.Map;

 class LinkedhHashMapDemo {

	public static void main(String args[]) {
		Map<Student,University> linkedHashMap = new LinkedHashMap<Student,University>();
		
		Student student1 = new Student(25,"akshay");
		Student student2 = new Student(20,"vinaya");
		Student student3 = new Student(1,"snigdha");
		Student student4 = new Student(100,"sruchii");
		
		
		
		University university1 = new University("SUNY",314498,student1);
		University university2 = new University("cincinnatti",34567,student2);
		University university3 = new University("CSU",123456,student3);
		University university4 = new University("texas",7766554,student4);
		University university5 = new University("florida",7766554,student4);
		University university6 = new University("SUNY",314498,student1);
		
		linkedHashMap.put(student4, university6);
		linkedHashMap.put(student1, university1);
		linkedHashMap.put(student2, university2);
		linkedHashMap.put(student3, university3);
		linkedHashMap.put(student4, university5);
	
		
		System.out.println(linkedHashMap.size());
		
		System.out.println(linkedHashMap);
		
		
	}

	
}


