import java.util.Scanner;
class Calculator
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int res=0;
	System.out.println("Enter two numbers ");
	int n1 = in.nextInt();
	int n2 = in.nextInt();
	System.out.println("1.Add");
	System.out.println("2.Subtract");
	System.out.println("3.Multiply");
	System.out.println("4.Divide");
	System.out.println("Enter Choice ");
	int ch = in.nextInt();
	switch(ch)
	{
	   case 1:res = n1 + n2;break;
	   case 2:res = n1 - n2;break;
	   case 3:res = n1 * n2;break;
	   case 4:res = n1 / n2;break;
	   default:System.out.println("Invalid Choice");
			System.exit(1);//comes out of program
	}
	System.out.println("Result = "+res);
   }
}