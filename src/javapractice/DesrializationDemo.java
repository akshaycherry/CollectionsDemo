package javapractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesrializationDemo {

	public static void main(String[] args) {
		String file="information.ser";
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		Serial s1=null;
		try {
			fileInputStream = new FileInputStream(file);
		    objectInputStream=new ObjectInputStream(fileInputStream);
		    s1=(Serial) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(s1);
		

	}

}
