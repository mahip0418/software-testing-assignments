package com.core;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,temp,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array elements");
		for(i=0;i<a.length;i++)
		{
			System.out.print("ENter " +i+ " element :");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum:" +sum);
		System.out.println("array elements are");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"] = " +a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0+i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("array elements are in acending order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"] = " +a[i]);
		}
	}
}
