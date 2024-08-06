import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("xxx");
		al.add("yyy");
		al.add("zzz");
		System.out.println(al);
		for(String s : al)
			System.out.println(s);
	}

}
