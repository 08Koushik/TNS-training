package multithreading;

class ThreadMain extends Thread{
	
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
      ThreadMain t1=new ThreadMain();
     
     // ThreadDemo t2=new ThreadDemo();
      t1.start();
		//t2.start();	
	}
}
