package com.pavan.test;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {

	 public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  // it will have the index and  doubly linked compare to arraylist linked list fast in adding values in between index
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add(1,"saipavan");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 } 

}
