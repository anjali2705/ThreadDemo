package Interface;


class C implements Runnable{
	public void run() {
		 for(int i=0; i < 10; i++) {
			 System.out.println("Hi");	
		     try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
}

class D implements Runnable{
	public void run() {
		 for(int i=0; i < 10; i++) {
			 System.out.println("Hello");	
			  try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
	}
}

public class ThreadRunableDemo {
	public static void main(String[] args) {
	 Runnable obj1 = new C();
	Runnable obj2 = new D();
	
	Thread t1= new Thread(obj1);
	Thread t2 = new Thread(obj2);
	
	t1.start();
	t2.start();
	
	}

}
