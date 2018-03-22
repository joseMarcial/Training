package training.threads.jose.com;

public class Counter {
	
	private int counter=0;
	

	void incrementCounter() {
		this.counter++;
	}
	
	void decrementCounter() {
		
		this.counter--;
	}
	
	int getCounter() {
		
		int couunterval= this.counter;
				return couunterval;
	}
	
	void initCounter(int initial_value  ) {
		
		this.counter= initial_value;
	}
	
	
	
	
	public static void main (String args[]) {
		
		Counter testCounter = new Counter();
		Counter testCounter2 = new Counter();
		testCounter2.initCounter(100);
		
		ThreadOne tOne = new ThreadOne();
		tOne.setCounter(testCounter);
		Thread thread1 = new Thread(tOne);
		ThreadTwo tTwo = new ThreadTwo();
		tTwo.setCounter(testCounter2);
		Thread thread2 = new Thread(tTwo);
		thread1.start();
		thread2.start();
		
	}
}




