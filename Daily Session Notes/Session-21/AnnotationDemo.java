class Vehicle
{
   void drive()
   {
	   System.out.println("Driving a Vehicle");
   }
}
class Car extends Vehicle
{
	@Override
   void drive()
   {
	   System.out.println("Driving a Car");
   }
}
public class AnnotationDemo {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}
