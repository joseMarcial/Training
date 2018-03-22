package training.threads.threadsafe.jose.com;

public class ThreadSafeExample implements Runnable {

	@Override
	public void run() {
		MyThreadSafeImpl miSingleton= MyThreadSafeImpl.getInstance();
		System.out.println(miSingleton.toString());
	}

}
