package setPackage;
import java.util.*;
public class HashSetPractice {

	public static void main(String[] args) {
		HashSet hs = new HashSet<String>();
		hs.add("Tijo");
		hs.add(1);
		hs.add(null);
		System.out.println(hs.add(null));
		hs.add(false);
		hs.add(1.0f);
		hs.add(2.9);
		HashSet hs1 =new HashSet(20);
		System.out.println(hs1.size());
		HashSet hs3 = new HashSet(20,0.65f);
		HashSet hs4 = new HashSet(hs);
		HashSet hs5 = new HashSet();
		hs5 = (HashSet) hs.clone();
		System.out.println(hs);
		System.out.println(hs5.remove(1));
		System.out.println(hs);
		System.out.println(hs5);
		System.out.println(hs4.remove(1));
		System.out.println(hs4);
		System.out.println(hs);
	}
}
