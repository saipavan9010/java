package onlineVideo;

//Encapsulation -> Binding data with methods 

class Student{
	private int rollno;
	private String name;
	
	//Getters and Setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student();
		
		obj.setRollno(5);
		obj.setName("saipavan");
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());

	}

}
