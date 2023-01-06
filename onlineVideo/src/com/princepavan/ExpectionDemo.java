package com.princepavan;

public class ExpectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b =2;
		try {
			
			int i= a/b;
			int k = 1;
			if(k==0) {
				throw new Exception();
			}
			System.out.println("no expection");
		}
		catch(Exception e) {
			System.err.println("Error ");
		}
		finally {
			System.out.println("out");
		}
		
		

	}

}
