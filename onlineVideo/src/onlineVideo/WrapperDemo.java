package onlineVideo;

public class WrapperDemo {

	public static void main(String[] args) {
		int i =5; // 5 value is storing in primitive variable;
		Integer obj = new Integer(i); // boxing or wrapping
		int j = obj.intValue(); // unboxing - unwrapping
		int k = 10;
		Integer value = k; // autoboxing 
		int z = value; // autounboxing
		
		Float obj2 = new Float(1.2); //wrapper class value stor in object
		
		String str = "123";
		int n = Integer.parseInt(str);

	}



}
