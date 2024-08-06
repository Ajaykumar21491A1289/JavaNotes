import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		//HashSet
		HashSet hs = new HashSet();
		hs.add("monitor");
		hs.add("keyboard");
		hs.add("mouse");
		hs.add("ups");
		hs.add("speakers");
		hs.add("monitor");//not an error - not added into the set
		System.out.println(hs);//[keyboard, mouse, speakers, ups, monitor]
		//LinkedHashSet
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("monitor");
		lhs.add("keyboard");
		lhs.add("mouse");
		lhs.add("ups");
		lhs.add("speakers");
		System.out.println(lhs);//[monitor,keyboard,mouse,ups,speakers]
		//TreeSet
		TreeSet ts = new TreeSet();
		ts.add("monitor");
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("ups");
		ts.add("speakers");
		//ts.add(10);//ClassCastException
		System.out.println(ts);//[keyboard, monitor,mouse, speakers, ups]
	}
}
/*
Note:
In TreeSet all the elements should be of same type else it will throw an exception
ClassCastException
*/