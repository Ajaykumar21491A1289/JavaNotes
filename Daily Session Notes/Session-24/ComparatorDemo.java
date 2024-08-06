import java.util.*;
public class ComparatorDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(5);
		ts.add(8);
		ts.add(6);
		ts.add(4);
		ts.add(7);
		System.out.println(ts);//[8,7,6,5,4]
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer n1 = (Integer)o1;
		Integer n2 = (Integer)o2;
		if (n1 < n2)
			return +1;//connect left
		else
			if (n1 > n2)
				return -1;//connect right
			else 
				return 0;//no change in the set
	}
}
