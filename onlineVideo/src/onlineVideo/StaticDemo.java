package onlineVideo;

class Emp{
	
	int eid;
	int salary;
	static String coe;
	
	// when you load class
	static {
		coe="pavan";
		
	}
	// when you create a object
	public Emp() {
		eid=5;
		salary=5000;
	}
	
	public void listEmp() {
		System.out.println(eid + " "+ salary+" "+ coe);
	}
	
}

public class StaticDemo {
	
	// static variable only in main bcz of static main 
	static int i;
	
	public static void main (String args[]) {
		i=10;
		
		Emp sai = new Emp();
		Emp saipavan = new Emp();
		
		sai.eid=2;
		sai.salary=2000;
		
		
		sai.listEmp();
		saipavan.listEmp();
		
	}

}
