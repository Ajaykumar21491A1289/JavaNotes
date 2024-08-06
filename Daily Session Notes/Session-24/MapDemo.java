import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		//HashMap
		HashMap hm = new HashMap();
		hm.put("monitor",5000);
		hm.put("keyboard",300);
		hm.put("mouse",250);
		hm.put("ups",1000);
		hm.put("speakers",2000);
		System.out.println(hm);
		//{keyboard=300, mouse=250, speakers=2000, ups=1000, monitor=5000}
		//LinkedHashMap
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("monitor",5000);
		lhm.put("keyboard",300);
		lhm.put("mouse",250);
		lhm.put("ups",1000);
		lhm.put("speakers",2000);
		System.out.println(lhm);
		//{monitor=5000, keyboard=300, mouse=250, ups=1000, speakers=2000}
		//TreeMap
		TreeMap tm = new TreeMap();
		tm.put("monitor",5000);
		tm.put("keyboard",300);
		tm.put("mouse",250);
		tm.put("ups",1000);
		tm.put("speakers",2000);
		System.out.println(tm);
		//{keyboard=300, monitor=5000, mouse=250, speakers=2000, ups=1000}
	}
}
