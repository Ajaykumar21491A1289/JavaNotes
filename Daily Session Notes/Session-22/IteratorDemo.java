import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("xxx");
		ll.add("yyy");
		System.out.println(ll);//[10,20,xxx,yyy]
		Iterator iter = ll.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		ListIterator listIter = ll.listIterator();
		while (listIter.hasNext())
		{
			System.out.println(listIter.next());
		}
		while(listIter.hasPrevious())
		{
			System.out.println(listIter.previous());
		}
	}
}
