/* W.A.J.P to Take three numbers from the user and print the greatest number */
package com.core;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a:");;
		a= sc.nextInt();
		System.out.print("enter b:");;
		b= sc.nextInt();
		System.out.print("enter c:");;
		c= sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greatger");
			}
			else
			{
				System.out.println("C is Greater");
			}
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println(" c is greater");
		}
	}
}
