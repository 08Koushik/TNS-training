package multithreading;

class ThreadRun implements Runnable {
	String name;
	public ThreadRun(String name) {
		this.name=name;
	}
	@Override
	public void run() {
     for(int i=0;i<5;i++) {
   	  System.out.println("The current thread"+name);
   	  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }	
	}
}

public class RunnableInterface {
	public static void main(String[] args) {
      ThreadRun t1=new ThreadRun("task1");
      ThreadRun t2=new ThreadRun("task2");
     Thread ob=new Thread(t1);
      Thread ob1=new Thread(t2);
     
      ob.setPriority(10);
      ob1.setPriority(1);
     
      ob.start();
      ob1.start();
		
	}
}
