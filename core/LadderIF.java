package com.core;

import java.util.Scanner;

public class LadderIF {
	public static void main(String[] args) {
		int s1, s2, s3, rno, total;
		double per;
		String sname;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter student name:");
		sname=sc.next();
		System.out.print("enter roll no:");
		rno=sc.nextInt();
		System.out.print("En"
				+ "ter marks of subject 1:");
		s1=sc.nextInt();
		System.out.print("Enter marks of subject 2:");
		s2=sc.nextInt();
		System.out.print("Enter marks of subject 3:");
		s3=sc.nextInt();
		
		total = s1+s2+s3;
		per= total/3;
		System.out.println("Student name:" +sname);
		System.out.println("total:" +total);
		System.out.println("percentage:"+per);
	}
}
