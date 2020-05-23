package com.akshay.practice.stringpractice;

public class StringPractice2 {

	public static void main(String[] args) {
		String words[]= {"krivis","Lakshmi"};
		int size=words.length;
		System.out.println(size);
		String str = "This is krivis technologies, at krivis you can learn full stack. Lakshmi sir our trainer";
		for(int index=0;index < size ;index++) {
			str=str.replace(words[index], "********");
		}
		System.out.println(str);
			

	}

}
