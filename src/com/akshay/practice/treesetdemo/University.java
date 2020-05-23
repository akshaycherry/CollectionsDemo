package com.akshay.practice.treesetdemo;


public class University implements Comparable{
	String universityName;
	int uId;
	Student student;
	
	public University(String universityName,int uId,Student student){
		this.universityName=universityName;
		this.uId=uId;
		this.student=student;
	}
	
	public String toString() {
		
		return  "\r" + "universityName = " + this.universityName  +"'"+ " uId = " + this.uId + "," + " student's" + student.toString()  ;
				 
	}

	/*@Override
	public boolean equals(Object o ) {
		University u = (University) o;
		if(u == null) return true;
		
		  if(!(u instanceof University)) return true;
		  
			 if(u == this) return false;
			 if(this.universityName.equalsIgnoreCase(u.universityName) && this.uId ==(u.uId) && this.student.equals(u.student) )
				    return true;
			 else
					return false;
			
       //return false;
	}
	
	public int hashCode() {
		return 10 * this.uId +100;
	}*/

	@Override
	public int compareTo(Object o) {
		University u = (University) o;
		//return 123456;
		if(this.universityName.equals(u.universityName) && this.uId == u.uId && this.student.equals(u.student)) return 1;
		return this.universityName.compareToIgnoreCase(u.universityName) ;
			
	}

}
