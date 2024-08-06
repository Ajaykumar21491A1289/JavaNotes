//Methods of Thread class
class MyThread extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println(t);//Thread[Thread-0,5,main]
		t.setName("MyThread");
		System.out.println(t);//Thread[MyThread,5,main]
		System.out.println(t.getName());//MyThread
		t.setPriority(8);
		/*
		 If the priority is <1 or >10 then it will throw IllegalArgumentException
		 */
		System.out.println(t);//Thread[MyThread,8,main]
		System.out.println(t.getPriority());//8
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();//invokes run()
	}
}
