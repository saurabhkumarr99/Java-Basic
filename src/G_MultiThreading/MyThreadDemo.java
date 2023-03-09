package G_MultiThreading;

class MyThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Thread1 -" + i);
		}
	}
}

class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			if (i == 35) {
				throw new NullPointerException();
			}
			System.out.println("Thread2 -" + i);
		}
	}
}

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();

		myThread1.start();
		myThread2.start();

	}

}
