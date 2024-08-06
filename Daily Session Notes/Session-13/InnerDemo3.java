//static inner class
class Outer3
{
	static int n = 100;
	static class Inner3
	{
		static void doStuff()
		{
			System.out.println("n = "+n);
		}
	}
}
public class InnerDemo3 {

	public static void main(String[] args) {
		Outer3.Inner3 inner = new Outer3.Inner3();
		//Outer3.Inner3 inner = new Outer3().new Inner3();//regular inner class
		inner.doStuff();

	}

}
