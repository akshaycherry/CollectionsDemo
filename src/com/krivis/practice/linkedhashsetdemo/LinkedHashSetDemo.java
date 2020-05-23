package com.krivis.practice.linkedhashsetdemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

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
		University university6 = new University("SUNY",314498,student1);
		
		
		Set<University> linkedHashSet = new LinkedHashSet<University>();
		linkedHashSet.add(university3);
		linkedHashSet.add(university1);
		linkedHashSet.add(university2);
		linkedHashSet.add(university4);
		linkedHashSet.add(university5);
		linkedHashSet.add(university6);
		linkedHashSet.add(university2);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		
		//linkedHashSet.add(university5);
		
		System.out.println(linkedHashSet.size());
		
		System.out.println(linkedHashSet);
		
		System.out.println("================================");
		/*for(int index = 0 ; index < linkedHashSet.size() ; index++) {
			System.out.println(linkedHashSet.);
		}*/
		/*System.out.println("================================");
		for(University akshay : linkedHashSet) {
			System.out.println(akshay);
			
		}
		System.out.println("================================");
		Iterator<University> i = linkedHashSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("================================");
		linkedHashSet.forEach(System.out::println);
		
		System.out.println("================================");
		linkedHashSet.forEach(element -> System.out.println(element));
		
		
		System.out.println("================================");
		linkedHashSet.forEach( (University u) -> {System.out.println(u);});*/
		

	}

}
