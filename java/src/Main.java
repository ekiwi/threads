
public class Main {
	
	public static void main(String[] args) throws InterruptedException
	{
		Thread countThread1 = new Thread(new CountThread("CountThread1", CountThread.Color.Red));
		Thread countThread2 = new Thread(new CountThread("CountThread2", CountThread.Color.Blue));
		
		// start two threads
		countThread1.start();
		countThread2.start();
		
		// wait for the threads to exit
		countThread1.join();
		countThread2.join();
		
	}

}