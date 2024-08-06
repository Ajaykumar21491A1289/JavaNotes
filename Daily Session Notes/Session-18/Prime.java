//Prime No
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a No");
		int n = in.nextInt();
		if (prime(n))
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
   static boolean prime(int n)
    {
    	boolean flag = true;
    	for(int i=2;i<n;i++)
    	{
    		if (n % i == 0)
    		{
    			flag = false;
    			break;
    		}
    	}
    	return flag;
    }
}
