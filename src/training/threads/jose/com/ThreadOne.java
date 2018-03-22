package training.threads.jose.com;


public class ThreadOne implements Runnable {
	
	private Counter counter;

	@Override
	public void run() {
		while(counter.getCounter()<100) {
		counter.incrementCounter();
		System.out.println("ThreadOne couting up "+counter.getCounter());
		}
	}
	
	public void setCounter(Counter counter){
		this.counter= counter;
	}

}
