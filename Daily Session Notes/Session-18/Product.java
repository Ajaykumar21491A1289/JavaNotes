//Product of two numbers without using *
import java.util.*;
public class Product {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x = in.nextInt();
		int y = in.nextInt();
		int p=0;
		for(int i=1;i<=y;i++)
			p = p + x;
		System.out.println("Product = "+p);
	}

}
