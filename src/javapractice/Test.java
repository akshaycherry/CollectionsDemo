package javapractice;

import com.sun.media.jfxmedia.logging.Logger;

/*class Test{
	public static void main(String[] args) 
	{ 
		try
		{ 
			int a[]= {1, 2, 3, 4}; 
			for (int i = 1; i <= 4; i++) 
			{ 
				System.out.println ("a[" + i + "]=" + a[i] + "\n"); 
			} 
		} 
		
		catch (ArrayIndexOutOfBoundsException e) 
		{ 
			System.out.println ("ArrayIndexOutOfBoundsException"); 
		}
		catch (Exception e) 
		{ 
			System.out.println ("error = " + e); 
		} 
	} 



}*/


/*
class Test 
{   int count = 0; 
  
    void A() throws Exception 
    { 
        try
        { 
            count++; 
              
            try
            { 
                count++; 
  
                try
                { 
                    count++; 
                    throw new Exception(); 
  
                } finally{
                	
                }
                  
                catch(Exception ex) 
                { 
                    count++; 
                    throw new Exception(); 
                }
            } 
              
            catch(Exception ex) 
            { 
                count++; 
            } 
        } 
          
        catch(Exception ex) 
        { 
            count++; 
        } 
  
    } 
  
    void display() 
    { 
        System.out.println(count); 
    } 
  
    public static void main(String[] args) throws Exception 
    { 
        Test obj = new Test(); 
        obj.A(); 
        obj.display(); 
    } 
} 
*/

/*
class Test 
{ 
	String str = "a"; 

	void A() 
	{ 
		try
		{ 
			str +="b"; 
			B(); 
		} 
		catch (Exception e) 
		{ 
			str += "c"; 
		} 
	} 

	void B() throws Exception  
	{ 
		try
		{ 
			str += "d"; 
			C(); 
		} 
		catch(Exception e) 
		{ 
			throw new Exception(); 
		} 
		finally
		{ 
			str += "e"; 
		} 

		str += "f"; 

	} 
	
	void C() throws Exception 
	{ 
		throw new Exception(); 
	} 

	void display() 
	{ 
		System.out.println(str); 
	} 

	public static void main(String[] args) 
	{ 
		Test object = new Test(); 
		object.A(); 
		object.display(); 
	} 

} 

*/
class Test{
	  public static void main(String args[])
	   {
	      try{
		 String num=String.valueOf (10) ;
		 System.out.println(num);
	      }catch(NumberFormatException e){
		  //System.out.println("Number format exception occurred");
	     // Log.error(e);
	      }
	      
	   }
}








