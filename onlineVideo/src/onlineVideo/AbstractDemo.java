package onlineVideo;

abstract class Human {
	public abstract void eat();
	public abstract void walk();
	public void run() {
		
	}
}

class Man extends Human{ // Man class is called as concrete class Human is abstract class
	public void eat() {
		
	}
	
	public void walk() {
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Human obj = new Man();

	}

}
