package com.pavan.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>(); // Set don't not allow boolean value coming to hashset it will not give sequence values it don't have insertion order 
		values.add(89);
		values.add(34);
		values.add(10);
		values.add(90);
		values.add(96);
		values.add(null);// it will allow one null value
		for(int i : values) {
			System.out.println(i);
		}
		System.out.println("this is the value treeset");
		Set<Integer> value = new TreeSet<>(); // Set don't not allow boolean value coming to TreeSet it will give sequence values 
		value.add(89);
		value.add(34);// it don't allow null values it will error
		value.add(13);
		value.add(90);
		value.add(96);
		for(int j : value) {
			System.out.println(j);
		
		}
		System.out.println("this is the value LinkedHashSet");
		LinkedHashSet<Integer> al=new LinkedHashSet();  // Set don't not allow boolean value coming to linkhashset it will  give sequence values it will have insertion order 
		al.add(89);
		al.add(34);
		al.add(10);
		al.add(90);
		al.add(96);
		al.add(null); // it will allow only one null values
		for(int k : al) {
			System.out.println(k);
		
		}
	}

}
