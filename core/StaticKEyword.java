package com.core;
import java.util.Scanner;
public class StaticKEyword {
	static int a;
	void setA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter A :");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("a: "+a);
	}
	public static void main(String[] args) {
		StaticKEyword s1= new StaticKEyword();
		StaticKEyword s2= new StaticKEyword();
		StaticKEyword s3= new StaticKEyword();
		
		s1.setA();
		s2.setA();
		s3.setA();
		
		s1.putA();
		s2.putA();
		s3.putA();
		
	}
}
