package com.pavan.test;

import java.util.ArrayDeque;
import java.util.Deque;
//The interface called Deque is present in java.util package. It is the subtype of the interface queue. 
//The Deque supports the addition as well as the removal of elements from both ends of the data structure.Deque is an acronym for "double ended queue"
//ArrayDeque has no capacity restrictions.
public class ArrayDequeDemo {

	public static void main(String[] args) {
		   Deque<String> deque = new ArrayDeque<String>(); //ArrayDeque is not thread safe, in the absence of external synchronization.Null elements are not allowed in the ArrayDeque.  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");   
		   deque.offerFirst("jai");  
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  
		    deque.pollLast();  
		    System.out.println("After pollLast() Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }  

	}

}
