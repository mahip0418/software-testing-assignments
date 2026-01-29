package com.core;

import java.util.Scanner;

public class p30 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        if(m>=91 && m<=100) 
        	System.out.println("Grade: AA");
        else if(m>=81) 
        	System.out.println("Grade: AB");
        else if(m>=71) 
        	System.out.println("Grade: BB");
        else if(m>=61) 
        	System.out.println("Grade: BC");
        else if(m>=51) 
        	System.out.println("Grade: CD");
        else if(m>=41) 
        	System.out.println("Grade: DD");
        else 
        	System.out.println("Fail");
    }
}
