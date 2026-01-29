/*  W.A.J.P to check given number is Prime or not? */
package com.core;
import java.util.Scanner;
public class p4 {
	public static void main(String[] args) {
		int i=2, n;
		boolean prime = true;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        if (n <= 1) {
            prime = false;
        }

        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
	}
}
