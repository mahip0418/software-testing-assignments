package com.core;
import java.util.Scanner;
public class Throwdemo {
	public static void demo() {
		int x; 
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("enter x : ");
			x=sc.nextInt();
			if(x>0)
			{
				System.out.println("square of " +x+ " is " +(x*x));
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(Exception e)
		{
			System.out.println("please enter positive value");
		}
	}
	public static void main(String[] args) {
		demo();
	}
}
