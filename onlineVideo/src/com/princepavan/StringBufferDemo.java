package com.princepavan;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer S1 = new StringBuffer("abc"); // StringBuffer is mutable 
		System.out.println(S1);
		System.out.println(S1.length());
		System.out.println(S1.append("sai"));
		System.out.println(S1.delete(1,2)); // i will delete group of chars 
		System.out.println(S1.deleteCharAt(1)); // i will delete one of chars 
	}

}
