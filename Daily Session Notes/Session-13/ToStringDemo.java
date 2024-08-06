//toString()
class Sample
{
	int i;
	int j;
	Sample(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	Sample(){}
	public String toString()
	{
		return "i="+i+" "+"j="+j;
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		Sample s = new Sample(10,20);
		System.out.println(s);

	}

}
