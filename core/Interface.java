package com.core;
interface ifs1
{
	static void math1()
	{
		System.out.println("math1 defined in interface ifs1");
	}
}
interface ifs2 extends ifs1
{
	void math2();
}
public class Interface implements ifs2 {
	public static void main(String[] args) {
		Interface i= new Interface();
		ifs1.math1();
		i.math2();
	}
	public void math2() {
		System.out.println("math2");
	}
}
