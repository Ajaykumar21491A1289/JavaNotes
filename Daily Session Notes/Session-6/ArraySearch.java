//Sequential or linear search
import java.util.Scanner;
class ArraySearch
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	int[] n = new int[5];
	System.out.println("Enter 5 values ");
	for(int i=0;i<n.length;i++)
 	  n[i] = in.nextInt();
	System.out.println("Enter value to search ");
	int key = in.nextInt();
	boolean flag = search(n,key);
	if (flag)
	   System.out.println("Found");
	else
	   System.out.println("Not Found");
   }
   static boolean search(int[] n,int key)
   {
	boolean flag = false;
	for(int i=0;i<n.length;i++)
	{
	  if (key == n[i])
	  {
		flag=true;
		break;
 	  }
	}
	return flag;
   }
}