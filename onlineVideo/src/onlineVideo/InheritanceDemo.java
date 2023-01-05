package onlineVideo;

class Add{
	
	public Add() {
		System.out.println("default constructor");
	}
	public Add(int i,int j) {
		System.out.println("constructor");
	}
	
	public int addition(int i, int j) {
		return i+j;
	}
	
	
	
}

class AddSub extends Add{
	
	public AddSub() {
		super(5,6);
	}
	
	public int  subraction(int i,int j) {
		
		return i-j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		AddSub obj1 = new AddSub();
		
		System.out.println(obj1.addition(1, 2));
		System.out.println(obj1.subraction(10, 9));
	

	}

}
