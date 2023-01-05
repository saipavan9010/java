package onlineVideo;

class Outer{
	static int a=20;
	public  static void show() {
		System.out.println(a);
	}
	class Inner {
		
		public void display() {
			System.out.print("display the value");
		}
		
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
		

	}

}
