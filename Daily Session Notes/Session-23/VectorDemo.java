import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add("xxx");
		v.add("yyy");
		System.out.println(v);//[10,20,xxx,yyy]
		Enumeration e = v.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
