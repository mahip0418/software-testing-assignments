package com.core;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowsDemo {
	public static void demo() throws ArithmeticException, InputMismatchException, ArrayIndexOutOfBoundsException
	{
		int x; 
		Scanner sc=new Scanner(System.in);
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
	public static void main(String[] args) {
		try{
			demo();
		}
		catch(Exception e)
		{
			System.out.println("please enter positive value");
		}
		finally
		{
			System.out.println("finally block called");
		}
	}
}