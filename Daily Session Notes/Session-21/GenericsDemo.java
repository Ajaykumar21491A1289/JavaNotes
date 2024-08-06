/*class IntClass
{
	Integer i;
	IntClass(Integer i)
	{
		this.i=i;
	}
	Integer getIntValue()
	{
		return i;
	}
}
class StringClass
{
	String s;
	StringClass(String s)
	{
		this.s=s;
	}
	String getStringValue()
	{
		return s;
	}
}*/
class GenClass <T>
{
	T i;
	GenClass(T i)
	{
		this.i=i;
	}
	T getValue()
	{
		return i;
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		/*IntClass ic = new IntClass(10);
		System.out.println(ic.getIntValue());//10
		StringClass sc = new StringClass("Hello");
		System.out.println(sc.getStringValue());//Hello
*/	
		GenClass<Integer> ic = new GenClass<Integer>(10);
		System.out.println(ic.getValue());//10
		GenClass<String> sc = new GenClass<String>("Hello");
		System.out.println(sc.getValue());//Hello
	}

}
