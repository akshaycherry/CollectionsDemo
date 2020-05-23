package com.akshay.practice.list;
import java.util.List;

import com.akshay.practice.list.ArrayListDemo;

public class ArrayMethodMain {

	public static void main(String[] args) {
		ArrayMethod arrayMethod = new ArrayMethod();
		List<String> l=arrayMethod.cherry();
		System.out.println(l);
		
		ArrayListDemo adl = new ArrayListDemo();
		//List<String> l1=adl.akshay(l);
		//System.out.println(l1);
		
		StudentList sl = new StudentList();
		List<Student> s= sl.value();
		System.out.println(s);
	}

}
