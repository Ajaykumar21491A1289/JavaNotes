import java.util.Scanner;
class CheckNumber
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a No ");
	int n = in.nextInt();
	if (n > 0)
	   System.out.println("Positive");
	else
	   if (n < 0)
	     System.out.println("Negative");
  	   else
	     System.out.println("Zero");
   }
}