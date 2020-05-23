package com.akshay.practice.stringpractice;

public class StringPractice1 {

	public static void main(String[] args) {
			/*String str="This is krivis technologies, at krivis you can learn full stack";
			str.split(" ");
			str=str.replace("krivis", "******");
			System.out.println(str);*/
		
		String s1 = "akshay";
		String s2 = "akshay";
		String s3 = new String("cherry");
		String s4 = new String("cherry");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3==s4);
		System.out.println(s3.contentEquals(s4));
	}

}
