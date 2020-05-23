package com.akshay.practice.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student(25,"akshay");
		Student student2 = new Student(20,"vinaya");
		Student student3 = new Student(1,"snigdha");
		Student student4 = new Student(100,"sruchii");
		
		Vector<Student> v = new Vector<Student>();  
		v.add(student1);
		v.add(student2);
		v.add(student3);
		v.add(student4);
		
		System.out.println(v);
		
		System.out.println("For loop");
		
		for(int index = 0 ; index < v.size() ; index++) {
			System.out.println(v.get(index));
		}
		
		System.out.println("Enhanced for loop");
		
		for(Student student : v) {
			System.out.println(student);
		}
		
		Iterator<Student> vectorIterator = v.iterator();
		
		System.out.println("Using Iterator");
		
		while(vectorIterator.hasNext()) {
			System.out.println(vectorIterator.next());
		}
		
		ListIterator<Student> vectorListIterator = v.listIterator(v.size());
		
		System.out.println("Using ListIterator");
		
		while(vectorListIterator.hasPrevious())
			System.out.println(vectorListIterator.previous());
		
		/*
		System.out.println("for each1==================");
		v.forEach(System.out::println);
		
		System.out.println("for each2==================");
		v.forEach( (value) -> {System.out.println(value); });
		
		System.out.println("for each3==================");
		
		v.forEach( (Student value) -> {System.out.println(value); });
	*/
	}
	
	

}
