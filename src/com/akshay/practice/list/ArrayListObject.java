package com.akshay.practice.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObject {
	Student student;

	public static void main(String[] args) {
		Student s = new Student(25,"akshay");
		List<Student> al=new ArrayList<Student>();
		al.add(s);
		al.get(0);
		System.out.println(al);
		
	al.forEach(System.out::println);
	}
}
