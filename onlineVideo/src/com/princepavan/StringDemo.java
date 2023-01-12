package com.princepavan;
// String are immutable
public class StringDemo {

	public static void main(String[] args) {
		String S1 = "ABC"; // I will load when class is loaded and set to s1 reference
		String S2 = new String("XYZ"); // it will create a object and set to reference
		String S3 = new String("ABC");
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S1.equals(S3));
		
	}

}
