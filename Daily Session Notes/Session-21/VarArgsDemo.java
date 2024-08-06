
public class VarArgsDemo {

	public static void main(String[] args) {
		System.out.println("Sum = "+sum(10,20,30));
		System.out.println("Sum = "+sum(10,20));
		System.out.println("Sum = "+sum(10));
	}
	static int sum(int... n) //n is variable arg and is an array
	{
		int sum=0;
		for(int i : n)
			sum = sum + i;
		return sum;
	}
}
