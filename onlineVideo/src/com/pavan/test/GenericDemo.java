package com.pavan.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//List is mutable

public class GenericDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList(); // List support index value it will support all specific datatype which we declare in angular bracket
		values.add(4);
		values.add(3);
		values.add(6);
		values.add(1,2);// in this first parameter is index second is value
		
		Collections.sort(values);
		Collections.reverse(values);
		System.out.println(values); // it will print all values in arraylist


	}

}
