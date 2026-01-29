package com.core;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a:");;
		a= sc.nextInt();
		System.out.println("enter b:");;
		b= sc.nextInt();
		c=a+b;
		System.out.println("addition = "+c);
		c=a-b;
		System.out.println("subtraction = "+c);
		c=a/b;
		System.out.println("division = "+c);
		c=a*b;
		System.out.println("multiplication = "+c);
		System.out.println(4*5);
	}
}