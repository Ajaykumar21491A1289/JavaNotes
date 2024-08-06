//Palindrome
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a No");
		int n = in.nextInt();
		int m = n;
		int rev=0;
		while (n != 0)
		{
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		if (m == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
/*
n=121

rev = rev*10+n%10;
rev = 0*10 + 121 % 10 = 0+1=1
n=n/10 = 121/10 = 12
---------------------------
rev = rev*10+n%10 = 1*10+12%10 = 10+2 = 12
n=n/10 = 12/10 =1
----------------------------------------
rev=rev*10+n%10 = 12*20+1%10 = 120+1=121
n=n/10 =1/10 =0
*/