package com.pavan.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// it will sort in one specified sort using sort you can create user defined sort using comparable in comparable compareTo is the method to sort
class Stud implements Comparable<Stud>{
	 int Rollno,marks;
	 String name;
	public Stud(int rollno, int marks, String name) {
		super();
		Rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [Rollno=" + Rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Stud s) {
		System.out.println("marks "+marks);
		System.out.println(s.marks);
		return marks>s.marks?1:-1;
	}
	 
}

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Stud> studs = new ArrayList<Stud>();
		studs.add(new Stud(23,67,"saipavan"));
		studs.add(new Stud(25,66,"ramkumar"));
		studs.add(new Stud(19,71,"ramkumar"));
		studs.add(new Stud(16,69,"ramkumar"));
		
		Collections.sort(studs);
		Collections.sort(studs,(i,j)->i.Rollno>j.Rollno?1:-1); // same above logic based on anonymous class
		System.out.println(studs.toString());
		

	}

}
