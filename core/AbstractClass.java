package com.core;
abstract class abs1
{
	void math1()
	{
		System.out.println("myth1");
	}
	abstract void math2();
}
class abs2 extends abs1
{
	void math2()
	{
		System.out.println("myth2");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		abs2 a = new abs2();
		a.math1();
		a.math2();
		
	}
}
