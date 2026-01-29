package com.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("hello");
		al.add(true);
		al.add(null);
		al.add('t');
		al.add(10);
		System.out.println(al);
		
		Iterator itr =al.iterator();
		System.out.println("-----interator-----");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext()){
			litr.set(litr.next()+ " tops technology");
		}
		
		litr=al.listIterator();
		System.out.println("-----List interator-----");
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		System.out.println("-----List interator Reverse-----");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
	}
}
