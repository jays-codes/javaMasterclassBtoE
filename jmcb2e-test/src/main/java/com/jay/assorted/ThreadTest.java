package com.jay.assorted;

public class ThreadTest {

	public static void main(String[] args) {
//		JayThread t1 = new JayThread("jays thread", 1000);
//		Thread thread1 = new Thread(t1);
//		thread1.start();

		JayThread jt = new JayThread("jays thread A", 1000);
		JayThread jt2 = new JayThread("jays thread B", 500);

		//		Thread thread1 = new Thread(t1);
//		thread1.start();

	}

}


class JayThread implements Runnable {
	
	Thread jaythread;
	String name;
	long countSpeed;
	
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(name + ": " + (i+1) + "...");
			try {
				Thread.sleep(countSpeed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	JayThread(String name, long countSpeed){
		this.name = name;
		this.countSpeed = countSpeed;
		
		jaythread = new Thread(this, name);
		jaythread.start();
	}
	
}