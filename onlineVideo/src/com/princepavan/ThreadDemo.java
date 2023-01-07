package com.princepavan;

class Hi extends Thread{ // for thread extends we should create a run method mandatory  
	
	public void run() { // thread internal method it should call the run method automatically when use start 
		for(int i=1; i<= 5; i++) {
			System.out.println("hi");
			try{Thread.sleep(500);}catch(Exception e) {};
		}
	}
}

class Hello extends Thread{
	public void run() {
		for(int i=1; i<= 5; i++) {
			System.out.println("hello");
			try{Thread.sleep(500);}catch(Exception e) {};
		}
	}

}

class HiHello implements Runnable{ // interface of the thread
	
	public void run() {
		
		System.out.println("hiiii hello");
	}
	
}

public class ThreadDemo { 

	public static void main(String[] args) throws InterruptedException {
		Hi obj = new Hi();
		Hello obj1 = new Hello();
		obj.start();
		try{Thread.sleep(10);}catch(Exception e) {}; // avoid clashing of thread
		obj1.start();
		
		HiHello obj2 = new HiHello();
		Thread t1 = new Thread(obj2,"HiHello thread"); // another way to create a thread as second parameter in interface runnable thread
		t1.start();
		obj.setPriority(Thread.MAX_PRIORITY);// its to set priority 
		System.out.println(obj.getPriority());
		obj.setName("Hi Thread"); // it set name of the thread
		System.out.println(obj.getName()); // it will return thread name
		obj1.join(); // these join will wait for thread to complete and then print next lines
		obj.join();
		System.out.println(t1.isAlive());// it will check thread is running or complete it will return boolean
		System.out.println("bye");
		


	}

}
