package com.akshay.practice.list;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	Student student;
	public List<Student> value() {
	List<Student> studentList = new ArrayList<Student>();
	Student student1 = new Student(25,"akshay");
	Student student2 = new Student(20,"vinaya");
	Student student3 = new Student(1,"snigdha");
	Student student4 = new Student(100,"sruchii");
	studentList.add(student1);
	studentList.add(student2);
	studentList.add(student3);
	studentList.add(student4);
	
	return studentList;
	
	}
	
	
	

}
