package training.threads.threadsafe.jose.com;

public class MyThreadSafeImpl {
	
	private static  MyThreadSafeImpl INSTANCE; 
	
	private MyThreadSafeImpl() {}
	
	public static MyThreadSafeImpl getInstance()
	{
		
		
			if(INSTANCE == null) {
				INSTANCE = createInstance();
			}
		
		return INSTANCE;
		
	}
	
	private static synchronized MyThreadSafeImpl createInstance(){
		INSTANCE = new MyThreadSafeImpl();
		return INSTANCE;
	}
	
	
	
	
	public static void main (String args[]) {
		
		
	Thread thread1  = new Thread(new ThreadSafeExample());
	Thread thread2  = new Thread(new ThreadSafeExample());
	thread1.start();
	thread2.start();
		
		
	}
	
	

}
