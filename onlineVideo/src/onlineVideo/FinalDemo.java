package onlineVideo;

final class ABC{ // if we declare final in class we should inherit it means extend 
	 final int DAY=7; // constant we cannot reassign it 
	public final int ABCD() { // final method we cannot override in subclasses
		return DAY;
	}
}

class XYZ {
	public int ABCD() {
		return 7; 
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		ABC obj = new ABC();
		System.out.println(obj.ABCD());

	}

}
