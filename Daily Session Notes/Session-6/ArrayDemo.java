import java.util.Scanner;
class ArrayDemo
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Size ");
	int size = in.nextInt();
	int[] n = new int[size];
	System.out.println("Enter "+size+" values");
	for(int i=0;i<n.length;i++)
  	  n[i] = in.nextInt();
	System.out.println("Given Array Elements are");
	for(int i=0;i<n.length;i++)
	  System.out.println(n[i]);
	//Enhanced for loop (foreach)- added in Java 5
	System.out.println("Given Array Elements");
	for(int i : n)
	   System.out.println(i);
   }
}