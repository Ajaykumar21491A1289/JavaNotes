//Method local inner class
class Outer2
{
	int n = 100;
	void doStuff1()
	{
		class Inner2
		{
			void doStuff2()
			{
				System.out.println("n = "+n);
			}
		}
		Inner2 inner = new Inner2();
		inner.doStuff2();
	}
}
public class InnerDemo2 {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.doStuff1();

	}

}
