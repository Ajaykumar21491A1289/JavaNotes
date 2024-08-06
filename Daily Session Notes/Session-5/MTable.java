import java.util.Scanner;
class MTable
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int n,i,p;
	System.out.println("Enter a No ");
	n = in.nextInt();
	for(i=1;i<=10;i++)
	{
	  p = n * i;
  	  System.out.println(n+"*"+i+"="+p);
        }
   }
}