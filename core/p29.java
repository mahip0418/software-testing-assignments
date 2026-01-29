package com.core;

public class p29 {
	public static void main(String[] args) {
        int[] a = {10, 50, 20, 40};

        int max = a[0], second = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                second = max;
                max = a[i];
            } else if(a[i] > second && a[i] != max){
                second = a[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}
