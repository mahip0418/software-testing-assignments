package com.core;

import java.util.Scanner;

public class p5 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n, temp, digit, sum = 0;
	        System.out.print("Enter number: ");
	        n = sc.nextInt();

	        temp = n;

	        while (temp > 0) {
	            digit = temp % 10;
	            sum = sum + (digit * digit * digit);
	            temp = temp / 10;
	        }

	        if (sum == n)
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not Armstrong Number");
	    }
}
