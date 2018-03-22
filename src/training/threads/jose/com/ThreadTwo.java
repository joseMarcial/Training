package training.threads.jose.com;

public class ThreadTwo implements Runnable {
	
	private Counter counter;

	@Override
	public void run() {
		while(counter.getCounter()>=1) {
		counter.decrementCounter();
		System.out.println("ThreadTwo couting down "+ counter.getCounter());
		}
	}
	
	public void setCounter(Counter counter){
		this.counter= counter;
	}

}
