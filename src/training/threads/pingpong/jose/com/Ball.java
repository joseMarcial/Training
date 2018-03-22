package training.threads.pingpong.jose.com;


public class Ball {
	
	
	
	public  synchronized void hittheBall(String threadname) 
	{
		System.out.println("la bola fue golpeada por "+ threadname);
		
	}
	
	
	

}
