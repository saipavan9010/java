package com.pavan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		List values = new ArrayList(); // List support index value it will support all datatype and its dynamic array it will take few time consume
		values.add(4);
		values.add(6);
		values.add(1,"pavan");// in this first parameter is index second is value
		System.out.println(values); // it will print all values in arraylist
		for(int i =0; i < values.size();i++) {
			System.out.println(values.get(i));
		}
		for(Object o:values) {
			System.out.println(o);
		}

	}

}
