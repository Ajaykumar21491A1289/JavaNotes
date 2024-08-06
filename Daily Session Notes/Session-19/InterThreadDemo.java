//Inter Thread Communication
class ThreadSum extends Thread
{
	int sum;
	public void run()
	{
		for(int i=1;i<=100;i++)
			sum = sum + i;
		synchronized(this)
		{
		   notify();
		}
	}
}
public class InterThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadSum ts = new ThreadSum();
		ts.start();
		synchronized(ts)
		{
		  ts.wait();// ts will tell other threads to wait.
		}
		System.out.println("Sum ="+ts.sum);
	}
}
