package com.pavan.test;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// queue is FIFO where insertion of elements occurs at the end of the list, and removal of elements occur at the beginning of the list
//PriorityQueue is also class that is defined in the collection framework that gives us a way for processing the objects on the basis of priority

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>(); 
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		queue.add("Rahul"); 
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  

	}

}
