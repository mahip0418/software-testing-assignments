package com.core;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

class student implements Serializable
{
	int sid;
	String sname;
	double per;
	public student(int sid, String sname, double per) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.per = per;
	}
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", per=" + per + "]";
	}
	
}
public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		student s1 = new student(1, "jigar", 70);
		FileOutputStream fos = new FileOutputStream("ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		student s2= (student) ois.readObject();
		System.out.println(s2);
		ois.close();
	}
}
