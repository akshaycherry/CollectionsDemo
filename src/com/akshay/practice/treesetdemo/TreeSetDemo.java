package com.akshay.practice.treesetdemo;

import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student(25,"akshay");
		Student student2 = new Student(20,"vinaya");
		Student student3 = new Student(1,"snigdha");
		Student student4 = new Student(100,"sruchii");
		
		
		
		University university1 = new University("SUNY",314498,student1);
		University university2 = new University("cincinnatti",34567,student2);
		University university3 = new University("CSU",123456,student3);
		University university4 = new University("texas",7766554,student4);
		University university5 = new University("florida",7766554,student4);
		University university6 = new University("SUNY",314498,student2);
		
		
		Set<University> treeSet = new TreeSet<University>();
		
		//try {
			
			treeSet.add(university1);
			treeSet.add(university2);
			treeSet.add(university3);
			treeSet.add(university4);
			treeSet.add(university5);
			treeSet.add(university6);
			//treeSet.add(university5);
			//treeSet.add(university6);
			
			
		//}
		/*catch(ClassCastException c) {
			System.out.println("Please specify genric type");
		}*/
		
		System.out.println(treeSet.size());
		System.out.println(treeSet);

	}

}
