package com.akshay.practice.maptree;



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
		
		return "age : " + this.age + "," + " student's name : " + this.name + "\r";
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		
		 if (this.age == s.age) return 0;
		 if (this.age > s.age) return 1;
		 if (this.age < s.age) return -1;
		 
		 return 1;
		
		//return this.name.compareToIgnoreCase(s.name);
	}
	
	public boolean equals(Object o) {
		Student student = (Student) o;
		if(student == null) return true;
		
		if(!(student instanceof Student)) return true;
		
		if(student == this) return false;
		
		if((this.name.equalsIgnoreCase(student.name) && this.age == student.age)) return false;
		
		else
			return false;
		
	}
	
	public int hashCode() {
		return 10 * this.age +100;
	}
}