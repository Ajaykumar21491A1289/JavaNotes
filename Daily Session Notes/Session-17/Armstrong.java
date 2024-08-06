//To check whether the given no is armstrong or not
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a No");
		int n = in.nextInt();//371
		int m = n;
		int sum = 0,r;
		while (n != 0)
		{
			r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		}
		//System.out.println(sum);
		if (m == sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
