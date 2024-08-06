import java.util.Scanner;
class MultiArrayDemo
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int[][] n = new int[3][3];
 	System.out.println("Enter 9 values ");
	for(int i=0;i<n.length;i++)
	for(int j=0;j<n[i].length;j++)
	   n[i][j] = in.nextInt();
	System.out.println("Given 3x3 Matrix");
	for(int i=0;i<n.length;i++)
	{
	   for(int j=0;j<n[i].length;j++)
	       System.out.print(n[i][j]+" ");
	   System.out.println();
	}
   }
}