import java.util.Scanner;
class SumMatrix
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int[][] a = new int[3][3];
	int[][] b = new int[3][3];
	int[][] s = new int[3][3];
	System.out.println("Enter First 3x3 Matrix");
	for(int i=0;i<a.length;i++)
	for(int j=0;j<a[i].length;j++)
	   a[i][j] = in.nextInt();
	System.out.println("Enter Second 3x3 Matrix");
	for(int i=0;i<b.length;i++)
	for(int j=0;j<b[i].length;j++)
	   b[i][j] = in.nextInt();
	for(int i=0;i<s.length;i++)
	for(int j=0;j<s[i].length;j++)
	   s[i][j] = a[i][j] + b[i][j];
	System.out.println("Sum of Matrices");
	for(int i=0;i<s.length;i++)
	{
	   for(int j=0;j<s[i].length;j++)
	     System.out.print(s[i][j]+" ");
	   System.out.println();
	}
   }
}