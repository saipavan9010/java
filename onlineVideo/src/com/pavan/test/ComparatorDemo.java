package com.pavan.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).

//It provides multiple sorting sequences, i.e., you can sort the elements on the basis of any data member, for example, rollno, name, age or anything else

class Studentss{  
	int rollno;  
	String name;  
	int age;  
	Studentss(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
} 

class AgeComparator implements Comparator<Object>{  
	public int compare(Object o1,Object o2){  
		Studentss s1=(Studentss)o1;  
		Studentss s2=(Studentss)o2;  
		  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
	}  
} 

class NameComparator implements Comparator<Object>{  
	public int compare(Object o1,Object o2){  
		Studentss s1=(Studentss)o1;  
		Studentss s2=(Studentss)o2;  
	  
		return s1.name.compareTo(s2.name);  
	}  
}  

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();  
		al.add(new Studentss(101,"Vijay",23));  
		al.add(new Studentss(106,"Ajay",27));  
		al.add(new Studentss(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Studentss st=(Studentss)itr.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Studentss st=(Studentss)itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		  

	}

}
