package training.threads.pingpong.jose.com;

public class PingPongManager {
	
	
	public static void main (String args[]) {
		
		Ball ball = new Ball() ;
		Player a = new Player("JugadorA", ball,true);
		Thread thread1=  new Thread(a);
		thread1.start();
		
		Player b = new Player("JugadorB", ball,false);
		Thread thread2=  new Thread(b);
		thread2.start();
	} 

}
