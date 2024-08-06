import java.util.Scanner;
class Student
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Roll No");
	int rollno = in.nextInt();
	System.out.println("Enter Name");
	String name = in.next();
	System.out.println("Enter 3 marks ");
	double mark1 = in.nextDouble();
	double mark2 = in.nextDouble();
	double mark3 = in.nextDouble();
	double total = mark1 + mark2 + mark3;
	double avg = total/3;
	System.out.println("Roll No = "+rollno);
	System.out.println("Name = "+name);
	System.out.println("Total = "+total);
	System.out.println("Average = "+avg);
   }
}