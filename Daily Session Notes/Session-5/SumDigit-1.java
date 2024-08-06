import java.util.Scanner;
class SumDigit
{
   public static void main(String[] args)
   {
	Scanner in= new Scanner(System.in);
	int n,r,sum=0;
  	System.out.println("enter a no");
	n = in.nextInt();
	while (n != 0)
	{
	   r = n % 10;
	   sum = sum + r;
	   n = n / 10;
	}
	System.out.println("Sum = "+sum);
   }
}