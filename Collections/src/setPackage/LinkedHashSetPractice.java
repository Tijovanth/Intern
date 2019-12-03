package setPackage;
import java.util.*;
public class LinkedHashSetPractice {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet<String>();
		hs.add("Tijo");
		hs.add(1);
		hs.add(null);
		System.out.println(hs.add(null));
		hs.add(false);
		hs.add(1.0f);
		hs.add(2.9);
		LinkedHashSet hs1 =new LinkedHashSet(20);
		System.out.println(hs1.size());
		LinkedHashSet hs3 = new LinkedHashSet(20,0.65f);
		HashSet hs4 = new HashSet(hs);
		LinkedHashSet hs5 =(LinkedHashSet) hs.clone();
		System.out.println("===============");
		//hs5 = (LinkedHashSet) 
		System.out.println(hs);
		System.out.println(hs5.remove(1));
		System.out.println(hs);
		System.out.println(hs5);
		System.out.println(hs4.remove(1));
		System.out.println(hs4);
		System.out.println(hs);
		String s1 = "Tio";
		Integer a = 1;
		//System.out.println(s1.equals(a));
		//System.out.println(s1.compareTo(a));

	}

}
