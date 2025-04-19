package Interface;

public class RunnableWithLambdaExpressionDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1= ()->{
			 for(int i=0; i < 10; i++) {
				 System.out.println("Hi");	
			     try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		};
		
		Runnable obj2= ()->{
			 for(int i=0; i < 10; i++) {
				 System.out.println("Hello");	
			     try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		};
		
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		System.out.println("Main FB-B1May25DL-2860");
		System.out.println("Change commit message ");
		
	}

}
