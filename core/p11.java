package com.core;

public class p11 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<=4;i++)
		{
			for (j = i; j < 4; j++) {
                System.out.print(" ");
            }
			for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
			System.out.println();
		}
		for(i=3;i>=1;i--)
		{
			for (j = i; j <= 3; j++) {
                System.out.print(" ");
            }
			for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
			System.out.println();
		}
	}
}
