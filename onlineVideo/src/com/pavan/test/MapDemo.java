package com.pavan.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> maps = new HashMap<>(); //Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key
		maps.put("myName", "pavan");//Java HashMap is non synchronized
		maps.put("hero", "Mahesh");
		System.out.println(maps);
		for(String key:maps.keySet())
		System.out.println(maps.get(key));
		System.out.println("Tree Map");
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();// It provides an efficient means of storing key-value pairs in sorted order Java TreeMap is non synchronized.va TreeMap cannot have a null key but can have multiple null values    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	     }    

	}

}
