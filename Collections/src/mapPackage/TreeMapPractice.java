package mapPackage;
import java.util.*;
public class TreeMapPractice {

	public static void main(String[] args) {
	
		TreeMap tm = new TreeMap(new MyComparator());
		TreeMap tm1 = new TreeMap();
		System.out.println(tm.put(1,"Tijo"));
		tm.put("tijo",23);
		tm.put(false,true);
		tm.put(1.0,12.0f);
		System.out.println(tm);
		System.out.println(tm.firstKey());
	//	System.out.println(tm1.firstKey());
		System.out.println(tm.lastKey());
		//System.out.println(tm1.lastKey());
		System.out.println(tm.headMap(39388));
		System.out.println(tm.tailMap("jjdjdjd"));
	  //System.out.println(tm.subMap(1, false));
		System.out.println(tm.comparator());
		System.out.println(tm1.comparator());
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj, Object ob)
	{
		return 1;
	}
}