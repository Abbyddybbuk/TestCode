
public class ThreadDemo1 {

	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}

			}
		};
		Thread thread1 = new Thread(run1);
		thread1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
