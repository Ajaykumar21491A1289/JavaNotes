import java.util.*;
public class UsingGenerics {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("xxx");
		al.add("yyy");
		al.add("zzz");
		System.out.println(al);//[xxx,yyy,zzz]
		for(String s : al)
			System.out.println(s);

	}

}
