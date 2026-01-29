package com.core;

import java.util.Scanner;

public class p6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n, a = 0, b = 1, c, i;
	        System.out.print("Enter number of terms: ");
	        n = sc.nextInt();

	        System.out.print("Fibonacci Series: ");
	        for (i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
}
