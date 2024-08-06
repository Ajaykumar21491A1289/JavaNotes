import java.util.Scanner;
class Bank
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int bal,amt,ch;
	System.out.println("Enter Current Balance ");
	bal = in.nextInt();
	while (true)
	{
	   System.out.println("1.Deposit");
	   System.out.println("2.Withdraw");
	   System.out.println("3.Display Balance");
	   System.out.println("4.Exit");
	   System.out.println("Enter Choice");
	   ch = in.nextInt();
	   switch(ch)
	   {
	 	case 1:System.out.println("Enter amount");
	   	       amt = in.nextInt();
			bal = bal + amt;break;
		case 2:System.out.println("Enter amount");
			amt = in.nextInt();
			if (amt > bal)
			   System.out.println("Balance is less");
			else
			   bal = bal - amt;
			break;
		case 3:System.out.println("Balance = "+bal);
			break;
		case 4:System.exit(1);
           }
	}
   }
}