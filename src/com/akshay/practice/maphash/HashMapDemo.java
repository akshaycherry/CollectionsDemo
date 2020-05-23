package com.akshay.practice.maphash;

import java.util.HashMap;
import java.util.Map;





public class HashMapDemo {
	
	public static void main(String args[]) {
		Map<Student,University> hashMap = new HashMap<Student, University>();
		
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
		
		hashMap.put(student1, university1);
		hashMap.put(student2, university2);
		//hashMap.put(student3, university3);
		//hashMap.put(student4, university5);
		//hashMap.put(student4, university6);
		hashMap.put(student4, null);
		hashMap.put(student5, null);
		hashMap.put(student3, null);
		hashMap.put(null, university1);
		hashMap.put(null, university5);
		
		
		System.out.println(hashMap.size() );
		System.out.println("===============");
		System.out.println(hashMap);
		
		
		hashMap.keySet();
		
		
	}
	
}
