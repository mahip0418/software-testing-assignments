package com.core;

import java.util.Scanner;

public class elseif {
	public static void main(String[] args) {
//		int a;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter a:");
//		a= sc.nextInt();
//		if(a>0) {
//			System.out.println("number is possitive");;
//		}
//		else {
//			System.out.println("number is negative");
//		}
//		if(a%2==0) {
//			System.out.println("number is even");;
//		}
//		else {
//			System.out.println("number is odd");
//		}
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a:");
		a= sc.nextInt();
		System.out.print("enter b:");
		b= sc.nextInt();
		System.out.print("enter c:");
		c= sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("a is max");
			}
			else {
			System.out.println("c is max");
			}
		}
		else if(b>c) {
			System.out.println("b is max");
		}
		else
		{
			System.out.println("c is max");
		}
	}
}
