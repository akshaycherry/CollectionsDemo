package com.akshay.practice.list;
import java.util.ArrayList;
import java.util.List;

public class ArrayMethod {
	ArrayMethod(){
		System.out.println("ArrayMethod default constructor");
	}
    
	public List<String> cherry() {
		List<String> list = new ArrayList<String>();
		list.add("akshay");
		list.add("snigdhaaa");
		list.add("vinaya");
		list.add("sruchitha");
		list.add("cherry");
		list.add("cosmos");
		return list;
	}
}
