package com.akshay.practice.list;

public class University implements Comparable {
	String universityName;
	String uId;
	Student student;
	
	public University(String universityName,String uId,Student student){
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
		if(u != null) {
		  if((u instanceof University)) {
			 if(u == this) {
				 if(this.universityName.equalsIgnoreCase(u.universityName) && this.uId.equalsIgnoreCase(u.uId))
				    return true;
				 else
					return false;
			}
		    
		}
		}
         return false;
	}*/
	
	public int hashCode() {
		return 10 + Integer.valueOf(this.uId);
	}

	@Override
	public int compareTo(Object o) {
		University u = (University) o;
		//return 123456;
		 return this.universityName.compareToIgnoreCase(u.universityName);
			
	}

}
