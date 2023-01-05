package onlineVideo;

class ShowA{
	 public void show() {
		 System.out.println("A show");
	 }
}

interface ShowC{
	void show();
}



public class AnonymousExample {

	public static void main(String[] args) {
		ShowA obj = new ShowA() { // Anonymous class with  method
			public void show() {
				System.out.println("B shows");
			}
		};
		obj.show();
		
		ShowC obj1 = new ShowC() { // Anonymous function with interface
			public void show() { 
				System.out.println("Show anonymous function");
			}
		};
		
		obj1.show();
		
		ShowC obj2 = ()->{ // function interface it will only achieve with one method inside interface
			System.out.println("function interface ");
		};
		
		obj2.show();

	}

}
