package com.pavan.test;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Java EnumSet class is the specialized Set implementation for use with enum types. It inherits AbstractSet class and implements the Set interface.

enum Days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  

public class EnumsetDemo {

	public static void main(String[] args) {
	    Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);  
	    // Traversing elements  
	    Iterator<Days> iter = set.iterator();  
	    while (iter.hasNext())  
	      System.out.println(iter.next());
	    System.out.println("Enum Map start");
	    //Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
		EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
		map.put(Days.MONDAY, "1");  
		map.put(Days.TUESDAY, "2");  
		map.put(Days.WEDNESDAY, "3");  
		map.put(Days.THURSDAY, "4");  
		    // print the map  
		for(Map.Entry m:map.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		} 
	}  

	

}
