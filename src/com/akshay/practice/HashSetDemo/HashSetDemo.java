
package com.akshay.practice.HashSetDemo;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import com.akshay.practice.list.LinkedListDemo;


public class HashSetDemo {

	public static void main(String[] args) {
		/* 1. Adding list into set
		Set<List> hashSet = new HashSet<List>();
		LinkedListDemo lld = new LinkedListDemo();
		//for(int index = 0 ; index < linkedList. ; index++)
		hashSet.add(lld.akshay());
		//hashSet.add(lld.akshay(1));
		//hashSet.add(lld.akshay(2));
		
		System.out.println(hashSet);
		System.out.println("enhanced for loop");
		for(List element : hashSet) {
			System.out.println(element);
		}
		System.out.println("using iterator");
		Iterator<List> i = hashSet.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("====================================================");
		hashSet.forEach(akshay -> {System.out.println(akshay);});
		
		
		
		//hashSet.forEach(System.out::println());
		
		hashSet.forEach((List l) -> {System.out.println(l);});*/
		
		Student student1 = new Student(25,"akshay");
		Student student2 = new Student(20,"vinaya");
		Student student3 = new Student(1,"snigdha");
		Student student4 = new Student(100,"sruchii");
		Student student5 = new Student(100,"sruchii");
		
		
		
		University university1 = new University("SUNY",31449,student1);
		University university2 = new University("cincinnatti",0034567,student2);
		University university3 = new University("csu",00123456,student3);
		University university4 = new University("texas",007766554,student4);
		University university5 = new University("florida",007766554,student4);
		University university6 = new University("SUNY",31449,student1);
		
		
		Set<University> hashSet = new HashSet<University>();
		hashSet.add(university3);
		hashSet.add(university1);
		hashSet.add(university2);
		hashSet.add(university4);
		hashSet.add(university5);
		hashSet.add(university6);
		//hashSet.add(university2);
		//hashSet.add(university1);
		//hashSet.add(university4);
		
		System.out.println(hashSet.size());
		
		System.out.println(hashSet);
	}
	
	}
	
	

