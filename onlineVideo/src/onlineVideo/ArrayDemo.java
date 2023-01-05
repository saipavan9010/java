package onlineVideo;

class Calcs{
	// rest operator
	public int add(int ...i) {
		int sum=0;
		for(int K:i) {
			sum +=K;
		}
		return sum;
	}
}

public class ArrayDemo {

	public static void main(String[] args) {
		int nums[]= new int[4];
		nums[0]=9;
		nums[1]=10;
		//foreach in java
		for(int K:nums) {
			System.out.println(K);
		}
		
		int numss[]= {8,2,9,17};
		int a[]= {1,2,3,4};
		int b[]= {10,20,30,40};
		int d[][]= {a,b};
		for(int K[]:d) {
			for(int l:K) {
				System.out.println(l);
			}
		}
		Calcs obj = new Calcs();
		System.out.println("sums "+obj.add(1,2,3,6,7));
		

	}

}
