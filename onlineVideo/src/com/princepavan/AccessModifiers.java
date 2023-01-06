package com.princepavan;

import com.pavan.test.Student;

public class AccessModifiers  extends Student{
	static int ranks = rank; 
	public void show() {
		
		System.out.println(rank);
	}

	public static void main(String[] args) {
		Student obj = new Student();
		
		obj.rollno=8;
		System.out.println(ranks);
		

		
	}

}
