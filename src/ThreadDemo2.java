
public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable run1 = ( ) -> {
			                     for (int i=0; i<10; i++) {
			                    	 System.out.println("Child Thread");
			                     }
		};
        
		Thread thread1 = new Thread(run1);
		thread1.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
