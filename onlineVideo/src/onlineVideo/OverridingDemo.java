package onlineVideo;

class A{
	int i;
	
	public void show() {
		System.out.println(i);
		System.out.println("in A");
	}
	
}

class B extends A{
	int i = 8;
	public void show() {
		// method overriding
		super.show();
		super.i=10;
		System.out.println("in B");
	}
	
}

class C extends A{
	int i = 8;
	public void show() {
		
		System.out.println("in C");
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		
		//Dynamic Method
		
		A obj1 = new C(); //runtime polymorphism
		obj1.show();
	}

}
