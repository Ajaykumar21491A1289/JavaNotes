class FinallyDemo
{
   public static void main(String[] args)
   {
	try
	{
	   int n = 10/0;
	   System.out.println("Result = "+n);
	}
	catch(NumberFormatException e)
	{
	   System.out.println("Cannot divide by zero");
	}
	finally
	{
	  System.out.println("Finally Block");
	}
	System.out.println("End of program");
   }
}