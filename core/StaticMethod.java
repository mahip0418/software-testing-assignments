package com.core;

public class StaticMethod {
	static int a=10;
	static int b;
	{
		System.out.println("block 1");
	}
	static void math(int x)
	{
		System.out.println("x : " +x);
		System.out.println("A : "+a);
		System.out.println("b : " +b);
	}
	public StaticMethod() {
		System.out.println("Static method constructor called");
	}
	static
	{
		System.out.println("static blockinitialized");
		b=a*4;
	}
	public static void main(String[] args) {
		math(12);
		StaticMethod s= new StaticMethod();
	}
	{
		System.out.println("Block 2");
	}
}
