package com.core;

import java.util.ArrayList;

public class p25 {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        list.remove(2); 

        System.out.println(list);
    }
}
