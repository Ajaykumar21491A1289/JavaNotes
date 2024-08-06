import java.io.*;
class Book implements Serializable
{
   int bno;
   String bname;
   transient double price;//not included during Serialization
   Book(int bno,String bname,double price)
   {
	   this.bno=bno;
	   this.bname=bname;
	   this.price=price;
   }
   Book(){}
   public String toString()
   {
	   return bno+" "+bname+" "+price;
   }
}
public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		//Serialization
		FileOutputStream fos = new FileOutputStream("Book.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Book b = new Book(111,"Java",500);
		oos.writeObject(b);
		oos.close();
		fos.close();
		//Deserialization
		FileInputStream fis = new FileInputStream("Book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book b1 = (Book)ois.readObject();
		System.out.println(b1);
		ois.close();
		fis.close();

	}

}
