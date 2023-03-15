

class TestThread1 extends Thread{
	
	public void run() {

		for(int i =0;i<=100;i++) {
			System.out.println("Thread 1 is working");
			
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}
	
}

class TestThread2 extends Thread{
	
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println("Thread 2 is working");
			
		}

		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}
	
}



public class Main {
	
	public static void main(String[] args) {
		
		TestThread1 obj1 = new TestThread1();
		TestThread2 obj2 = new TestThread2();
		
		obj1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		obj2.start();
	}

}

























