package com.core;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		int i,sum=0,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter n : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=i;
		}
		System.out.println("sum :" +sum);
	}
}
//Scanner sc= new Scanner(System.in);
//System.out.print("enter n : ");
//n=sc.nextInt();
//sum=sum+i;
//System.out.println("sum :" +sum);