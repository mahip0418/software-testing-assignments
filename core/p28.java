package com.core;
abstract class Parent {
    abstract void message();
}

class FirstSub extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSub extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}
public class p28 {
	 public static void main(String[] args) {
	        Parent p1 = new FirstSub();
	        Parent p2 = new SecondSub();

	        p1.message();
	        p2.message();
	    }
}
