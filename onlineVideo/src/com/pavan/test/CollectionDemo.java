package com.pavan.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//ArrayList it is not thread safe and it fast.It can increase 50 percentage of the current size after capacity occupy
 
public class CollectionDemo {

	public static void main(String[] args) {
		Collection values = new ArrayList(); // its does not have index values it will support all datatypes 
		values.add(4);
		values.add(6);
		values.add(5);
		System.out.println(values); // it will print all values in arraylist
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); // it will print value of arraylist one by one using next method
		}
	}

}
