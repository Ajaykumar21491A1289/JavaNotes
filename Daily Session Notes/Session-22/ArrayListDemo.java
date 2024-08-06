import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);//al.add(new Integer(10)); //before Java 5
		al.add(20);
		al.add("xxx");
		al.add("yyy");
		System.out.println(al);//[10,20,xxx,yyy]
		al.add(2,"ppp");//add element at 2nd position
		System.out.println(al);//[10,20,ppp,xxx,yyy]
		al.set(2,"qqq");
		System.out.println(al);//[10,20,qqq,xxx,yyy]
		al.remove("qqq");
		System.out.println(al);//[10,20,xxx,yyy]
		al.remove(2);
		System.out.println(al);//[10,20,yyy]
		String s = (String)al.get(2);//here we are converting the object type to string type the linked list always returns the object type
		System.out.println(s);//yyy
		System.out.println("Size = "+al.size());//Size = 3
	}

}
