package javapractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String args[]) throws Exception {
		String file="information.ser";
		//Serial s = new Serial("akshay",25,10000);
		Serial s=new Serial();
		s.setName("aakash");
		s.setAge(27);
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		//try {
			fileOutputStream= new FileOutputStream(file);
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(s);
			objectOutputStream.close();
			fileOutputStream.close();
		/*} catch (IOException e) {
			e.printStackTrace();
		}*/
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		Serial s1=null;
		//try {
			fileInputStream = new FileInputStream(file);
		    objectInputStream=new ObjectInputStream(fileInputStream);
		    s1=(Serial) objectInputStream.readObject();
		    objectInputStream.close();
			fileInputStream.close();
		/*} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();*/
		/*} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
	
		//System.out.println(s1.age);
		//System.out.println(s1.name);
		//System.out.println(s1.z);
		
		s1.getName();
		s1.getAge();
		//s.getName();
		//s.getAge();
		s1.value();
		//s.value();


}
}