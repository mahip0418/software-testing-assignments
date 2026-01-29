package com.core;

import java.util.Scanner;
class MyRun implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable");
    }
}
public class p21 {
	  public static void main(String[] args) {
	        MyRun r = new MyRun();
	        Thread t = new Thread(r);
	        t.start();
	    }
}
