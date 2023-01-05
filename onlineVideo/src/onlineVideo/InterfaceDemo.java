package onlineVideo;
interface Writer{
	
	 void write();
	 
	 default void show() { // inside interface we can define method with default only above java 1.8
		 System.out.println("define interface method calling");
	 }
	
}

interface MyDemo{
	int num = 8; // its default final datatype when you create a variable inside the interface 
	static void show() {
		System.out.println("my demo data");
	}
}


class Pen implements Writer,MyDemo{ // multi inheritance achieved with interface
	public void write() {
		System.out.println("in pen");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Writer.super.show(); // to which interface method to call with interface name with super key
		MyDemo.show(); // no need to use super for static method in interface
	}
}

class Pencil implements Writer {
	public void write() {
		System.out.println("in pencil");
	}
}

class Kit {
	public void doSomething(Writer p) {
		p.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
	Kit obj = new Kit();
	Writer pen = new Pen();
	Writer pc = new Pencil();
	obj.doSomething(pen);
	pen.show();

	}

}
