package javapractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial implements Serializable{
	String file="information.ser";
	static int z=100;
	String name;
	int age;
	Serial(String name,int age,int z){
		this.name=name;
		this.age=age;
		this.z=z;
	}
	Serial(){
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void serializable(Serial s, String s1) {
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(s1);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(s);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	Serial s1=null;
	public Serial deserializable(Serial s, String file) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(file); 
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Serial s1 =(Serial) objectInputStream.readObject();
		objectInputStream.close();
		fileInputStream.close();
		return s1;
	}
	
	public void value() {
	System.out.println(name + "," +age);	
	}
	
	

}
