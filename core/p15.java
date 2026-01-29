package com.core;

import java.util.Scanner;

public class p15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter 5 elements:");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        };

        System.out.print("Enter element to find: ");
        int x = sc.nextInt();

        int index = -1;
        for(int i=0;i<a.length;i++){
            if(a[i] == x){
                index = i;
                break;
            }
        }

        System.out.println("Index = " + index);
    }
}
