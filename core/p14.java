package com.core;

import java.util.Scanner;

public class p14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        double avg = (double)sum / 5;
        System.out.println("Average = " + avg);
    }
}
