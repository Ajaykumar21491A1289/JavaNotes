import java.util.Scanner;
class BigThree
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter 3 numbers ");
	int n1 = in.nextInt();
	int n2 = in.nextInt();
	int n3 = in.nextInt();
	if (n1 > n2 && n1 > n3)
	  System.out.println("Big = "+n1);
        else
	    if (n2 > n3)
		System.out.println("Big="+n2);
	    else
		System.out.println("Big="+n3);
   }
}