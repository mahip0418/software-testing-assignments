package com.core;

import java.util.Scanner;

public class p19 {
	public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
	}
}
