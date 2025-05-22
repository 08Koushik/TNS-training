package multithreading;

class ThreadSync {
	synchronized public static void add(int n) throws InterruptedException {
		
		for(int i=0;i<4;i++) {
			System.out.println(n+i);
			Thread.sleep(1000);
		}
		
	}
	
}

public class ThreadSynchronization {
	public static void main(String[] args) {
       Thread t1=new Thread(){
       	public void run() {
       		try {
					ThreadSync.add(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
       	}
       };
		
		
       Thread t2=new Thread(){
       	public void run() {
       		try {
					ThreadSync.add(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
       	}
       };
		
		t1.start();
		t2.start();
		
	}
}
