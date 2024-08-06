//Regular Inner class
class Outer1
{
	int n = 100;
	class Inner1
	{
		void doStuff()
		{
			System.out.println("n="+n);
		}
	}
}
public class InnerDemo1 {

	public static void main(String[] args) {
		Outer1.Inner1 inner = new Outer1().new Inner1();
		inner.doStuff();
	}

}
