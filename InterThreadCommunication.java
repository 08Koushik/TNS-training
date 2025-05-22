package multithreading;

class ThreadComm {
	
	int i;
	boolean flag=false;
	
	synchronized void deliver() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.i=i;
		flag=true;
		System.out.println("Data delievered"+i);
		notify();
		
	}
	
	synchronized int receive() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data received"+i);
		flag=false;
		notify();
		return i;
	}
	
}

class Thread1 extends Thread{
	
	ThreadComm tc;
	public Thread1(ThreadComm tc) {
		super();
		this.tc = tc;
	}
	
	public void run() {
		for(int j=1;j<5;j++) {
			tc.deliver();
		}
	}
	class Thread2 extends Thread{
	
	ThreadComm tc;
	public Thread2(ThreadComm tc) {
		super();
		this.tc = tc;
	}
	
	public void run() {
		for(int k=0;k<=5;k++) {
			tc.receive();
		}
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {
			ThreadComm tc=new ThreadComm();
			Thread1 t1=new Thread1(tc);
			Thread2 t2=new Thread2(tc);
			t1.start();
			t2.start();
	}
}

