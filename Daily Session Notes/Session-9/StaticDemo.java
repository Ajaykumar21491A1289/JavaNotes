class Sample
{
   int m;//instance or non-static variable
   static int n;//class or static variable
   void xxx() //instance or non-static method
   {
	m=10;
	n=20;
   }
   static void yyy() //class or static method
   {
	//m=30;//Error
	n=40;
   }
   void display()
   {
	System.out.println("m="+m+" "+"n="+n);
   }
}
class StaticDemo
{
   public static void main(String[] args)
   {
	Sample s1 = new Sample();
	s1.xxx();
	s1.display();//m=10 n=20
	Sample s2 = new Sample();
	s2.display();//m=0 n=20
	s2.yyy();
	s1.display();//m=10 n=40
	s2.display();//m=0 n=40
	Sample.n=50;
	s1.display();//m=10 n=50
	s2.display();//m=0 n=50
   }
}