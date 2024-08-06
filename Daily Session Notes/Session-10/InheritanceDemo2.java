//Polymorphism - Method Overloading and Method Overriding
class Base
{
   int i;
   int j;
   void input(int i,int j)
   {
	this.i=i;
	this.j=j;
   }
   void display()
   {
	System.out.println("i="+i+" "+"j="+j);
   }
}
class Derived extends Base
{
   int k;
   void input(int k) //Overloaded method
   {
	this.k=k;
   }
   void display() //Overridden method
   {
	super.display();//calls Base class display()
	System.out.println("k="+k);
   }
}
class InheritanceDemo2
{
    public static void main(String[] args)
    {
	Base b = new Base();
	b.input(10,20);
	b.display();//i=10 j=20
	Derived d = new Derived();
	d.input(30,40);
	d.display();//i=30 j=40 k=0
	d.input(50);
	d.display();//i=30 j=40 k=50
    }
}