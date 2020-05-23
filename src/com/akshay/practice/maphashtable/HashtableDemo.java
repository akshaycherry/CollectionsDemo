package com.akshay.practice.maphashtable;

import java.util.Hashtable;

import java.util.Map;

public class HashtableDemo {
	public static void main(String args[]) {
		
			Map<Student,University> hashTable = new Hashtable<Student,University>();
			
			Student student1 = new Student(1,"akshay");
			Student student2 = new Student(2,"vinaya");
			Student student3 = new Student(3,"snigdha");
			Student student4 = new Student(4,"sruchii");
			
			
			
			University university1 = new University("SUNY",314498,student1);
			University university2 = new University("cincinnatti",34567,student2);
			University university3 = new University("CSU",123456,student3);
			University university4 = new University("texas",7766554,student4);
			University university5 = new University("florida",7766554,student4);
			University university6 = new University("SUNY",314498,student1);
			
			hashTable.put(student4, university6);
			hashTable.put(student1, university1);
			hashTable.put(student2, university2);
			hashTable.put(student3, university3);
			hashTable.put(student4, university5);
		
			
			System.out.println(hashTable.size());
			
			System.out.println(hashTable);
			
			
		
		
		
	}
}
