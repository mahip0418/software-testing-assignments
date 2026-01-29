package com.core;

import java.util.Scanner;

public class p20 {
	 public static void main(String[] args) {
	        try {
	            int[] a = new int[3];
	            a[5] = 10;
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Error");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Error");
	        }
	        catch (Exception e) {
	            System.out.println("Other Error");
	        }
	    }
}
