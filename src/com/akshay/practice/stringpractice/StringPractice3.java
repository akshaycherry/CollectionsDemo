package com.akshay.practice.stringpractice;

public class StringPractice3 {

	public static void main(String[] args) {
		
		String personNames[] ={"Lakshmi","Arjun"}; 
		String companyNames[] ={"krivis","Haal"}; 
		
		String str = "This is Krivistechnologies,Krivis is subsidy of Haal tech, at krivis you can learn full stack. Lakshmi sir our trainer, Arjun is founder";
		for(int index=0;index<personNames.length;index++) {
			str=str.replace(personNames[index],"****");
		}
		
		for(int index=0; index < companyNames.length; index++ ) {
			str=str.replaceAll("(?i)"+companyNames[index],"####");
		}	
			
		System.out.println(str);
		}
	}

