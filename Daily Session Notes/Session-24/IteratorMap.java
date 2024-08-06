import java.util.*;
public class IteratorMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("monitor",5000);
		hm.put("keyboard",300);
		hm.put("mouse",250);
		hm.put("ups",1000);
		hm.put("speakers",2000);
		System.out.println(hm);
		Set s = hm.entrySet();//converts Map into Set
		Iterator iter = s.iterator();
		while(iter.hasNext())
		{
			Map.Entry me = (Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

}
