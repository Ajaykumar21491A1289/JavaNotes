import java.util.*;
public class ArraysDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("Enter 5 values");
		for(int i=0;i<n.length;i++)
			n[i] = in.nextInt();
		System.out.println("Before Sorting");
		for(int x: n)
			System.out.print(x+" ");
		Arrays.sort(n);
		System.out.println();
		System.out.println("Sorted Order");
		for(int x: n)
			System.out.print(x+" ");
		System.out.println("Enter value to search");
		int key = in.nextInt();
		int pos = Arrays.binarySearch(n, key);
		if (pos < 0)
			System.out.println("Not Found");
		else
			System.out.println("Position = "+pos);
	}

}
