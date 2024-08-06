//Constructors in Inheritance
class Base
{
   int i;
   int j;
   Base(int i,int j)
   {
	this.i=i;
	this.j=j;
   }
   Base(){}
   void display()
   {
	System.out.println("i="+i+" "+"j="+j);
   }
}
class Derived extends Base
{
   int k;
   Derived(int k) 
   {
	//super();//added implicitly
	super(30,40);//call it explicitly
	this.k=k;
   }
   void display() //Overridden method
   {
	super.display();//calls Base class display()
	System.out.println("k="+k);
   }
}
class InheritanceDemo3
{
    public static void main(String[] args)
    {
	Base b = new Base(10,20);
	b.display();//i=10 j=20
	Derived d = new Derived(50);
	d.display();//i=30 j=40 k=50
    }
}