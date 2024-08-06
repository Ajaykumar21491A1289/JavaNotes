import java.util.Scanner;
class SumTen
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int n,i=1,sum=0;
	while (i <= 10)
	{
	   System.out.println("Enter a No ");
	   n = in.nextInt();
	   sum = sum + n;
	   i++;
	}
	System.out.println("Sum = "+sum);
   }
}