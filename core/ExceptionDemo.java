package com.core;
import java.util.Scanner;
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start code");
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("ENter a :");
			a=sc.nextInt();
			System.out.print("ENter b :");
			b=sc.nextInt();
			c=a/b;
			System.out.println("division : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught : "+e);
		}
		System.out.println("end code");
	}
}
