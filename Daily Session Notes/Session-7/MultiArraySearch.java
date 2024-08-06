import java.util.Scanner;
class MultiArraySearch
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int[][] n = new int[3][3];
	System.out.println("Enter 9 values");
	for(int i=0;i<n.length;i++)
	for(int j=0;j<n[i].length;j++)
	   n[i][j] = in.nextInt();
	System.out.println("Enter value to search ");
	int key = in.nextInt();
	boolean flag = false;
	x:
	//System.out.println("xx");//Error
	for(int i=0;i<n.length;i++)
	{
	   for(int j=0;j<n[i].length;j++)
	   {
		if (key == n[i][j])
		{
		   flag = true;
		   break x;
	 	}
	   }
	}
	if (flag)
	   System.out.println("Found");
	else
	   System.out.println("Not Found");
   }
}