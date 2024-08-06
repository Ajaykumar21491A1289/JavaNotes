class Sample
{
   int i;
   int j;
   Sample(int i,int j) //parameterized constructor
   {
	this.i=i;
	this.j=j;
   }
   Sample(){} //default constructor
   void display()
   {
	System.out.println("i="+i+" "+"j="+j);
   }
}
class ConstructorDemo
{
   public static void main(String[] args)
   {
	Sample s1 = new Sample(10,20);
	s1.display();//i=10 j=20
	Sample s2 = new Sample();
	s2.display();//i=0 j=0
   }
}