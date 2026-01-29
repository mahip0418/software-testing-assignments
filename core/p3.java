/*  W.A.J.P to find factorial for Given Number */
package com.core;
import java.util.Scanner;
public class p3 {
	public static void main(String[] args) {
		int i=1,n;
		long fact=1;
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Enter number: ");
	      n = sc.nextInt();
	      while (i <= n) {
	          fact = fact * i;
	          i++;
	      }
	      System.out.println("Factorial = " + fact);
	}
}
