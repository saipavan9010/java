package onlineVideo;
// constructor overloading and method overloading
class Calc{
	int num1;
	int num2;
	int result;
	
	public void addition() {
		result = num1 + num2;
		
	}
	
	public void addition (int i, int j) {
		System.out.println(i+j);
	}
	
	public Calc() {
		System.out.println("hi");
		
	}
	
	public Calc(int num1,int num2) {
		System.out.println("hello");
	}
}

public class ObjectDemo {
	
	public static void main(String args[]) {
		
		Calc object = new Calc();
		object.addition(2, 2);
		Calc obj = new Calc(2,3);
		
		
	}

}
