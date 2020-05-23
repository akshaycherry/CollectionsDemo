package com.akshay.practice.list;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String args[]) {
	
	List<String> list = new ArrayList<String>();
	list.add("akshay");
	list.add("snigdhaaa");
	list.add("vinaya");
	list.add("sruchitha");
	list.add("cherry");
	list.add("cosmos");
	list.add("xyz");
	
	
	
	//System.out.println(list);
	
	/*for(int index = 0 ; index < list.size() ; index++) {
		System.out.println(list.get(index));
	}*/
	
	list.add(1,"akshara");
	System.out.println(list);
	//list.remove(6);
	//System.out.println(list);
	//list.remove("cherry");
	//System.out.println(list);
	
	/*for(String s : list) {
		System.out.println(s);
	}*/
	
	/*Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}*/
	
	/*ListIterator<String> iterator2 = list.listIterator();
	while(iterator2.hasNext()) {
		System.out.println(iterator2.next());
	}*/
	
	ListIterator<String> i1 = list.listIterator();	
	while(i1.hasPrevious()) {
		System.out.println(i1.previous());
	}

}

	
		
	
}
