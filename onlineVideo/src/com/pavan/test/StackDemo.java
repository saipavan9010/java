package com.pavan.test;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> obj = new Stack<String>(); //stack will LIFO 
		obj.add("call of duty");
		obj.add("Guitor Hero");
		obj.add("Super Monkey ball");
		obj.add("Tenis ball");
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);

	}

}
