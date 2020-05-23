package com.akshay.practice.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	University university;
	
	LinkedList<University> linkedList = new LinkedList<University>();
	
	public LinkedListDemo(){
		
	}
	
	//public static void main(String args[]) {
	
		public LinkedList<University> akshay(){
			
		Student student1 = new Student(25,"akshay");
		Student student2 = new Student(20,"vinaya");
		Student student3 = new Student(1,"snigdha");
		Student student4 = new Student(100,"sruchii");
		
		
		
		University university1 = new University("SUNY","U00314498",student1);
		University university2 = new University("cincinnatti","U0034567",student2);
		University university3 = new University("CSU","U00123456",student3);
		
		linkedList.add(university1);
		linkedList.add(university2);
		linkedList.add(university3);
		
		
		//System.out.println(linkedList);
		
		return linkedList;
		}
		
		
		
		
		
		

		
		/*System.out.println("using for loop");
		for(int index = 0 ; index < linkedList.size() ; index++)
			System.out.println(linkedList.get(index));
		
		System.out.println("using enhanced for loop");
		for(University u : linkedList)
			System.out.println(linkedList);
		
		System.out.println("using iteartor");
		Iterator<University> i = linkedList.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		*/
	//}
}
