package training.threads.pingpong.jose.com;


public class Player implements Runnable {
	
	Ball ball;
	String name;
	Boolean initiator;
		
		
	Player (String name, Ball ball, Boolean isInitiator ){
		this.name= name ;
		this.ball= ball;
		this.initiator= isInitiator;
	}

	@Override
	public void run() {
		
		while(true)
		{	
			if (initiator) 
			{	
				hitTheBall();
				waitForMyTime();
			}
			else {
				waitForMyTime();
			}
		}
		
	}
	
	public  void hitTheBall() {
		ball.hittheBall(this.name);	
		this.initiator=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (ball) {
			ball.notifyAll();
		}
	}
	
	public  void waitForMyTime() {
		try {
			
			synchronized (ball) {
				
			System.out.println(this.name + " esta  esperando ");
			this.initiator=true;
			ball.wait();
			System.out.println(this.name + " Ha despertado  ");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
