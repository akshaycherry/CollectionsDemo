package javapractice;

 class ExceptionDemo extends Exception{ }

	class Main { 
	public static void main(String args[]) { 
		try { 
			new ExceptionDemo(); 
		} 
		/*catch(ExceptionDemo t) { 
			System.out.println("Got the Test Exception"); 
		} */
		finally { 
			System.out.println("Inside finally block "); 
		} 
	} 
	} 


