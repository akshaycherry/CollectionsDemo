package com.akshay.practice.list;

public class Student implements Comparable{
	int age;
	String name;
	
	Student(){
		System.out.println("Student class default constructor");
	}
	public Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		
		return "age = " + this.age + "," + " student's name = " + this.name + "\r";
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		return this.name.compareToIgnoreCase(s.name);
	}
     

}
