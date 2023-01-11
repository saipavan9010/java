package com.pavan.test;

import java.util.Vector;

// Vector is same as Arraylist it will create dynamic array its default capacity is 10 once it is occupy it will create again 100 percent capacity example 20 

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector(); // it is thread safe and slow compare arraylist
		v.add(4); 
		v.add(6);
		v.add(7);
		v.add(4); 
		v.add(6);
		v.add(7);
		v.add(9); 
		v.add(6);
		v.add(8);
		v.add(2); 
		v.add(1);
		v.add(3);
		
		for(int i : v) {
			System.out.println(i);
		}
		
		System.out.println("capacity is "+v.capacity());

	}

}
