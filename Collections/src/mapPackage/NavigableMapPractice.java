package mapPackage;
import java.util.*;
public class NavigableMapPractice {

	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(1000,"Tijo");
		t.put(2000,"vanth");
		t.put(3000,"Kama");
		t.put(4000,"Ajay");
		t.put(5000,"Vishal");
		System.out.println(t.lowerKey(2000));
		System.out.println(t.higherKey(3000));
		System.out.println(t.ceilingKey(3000));
		System.out.println(t.floorKey(3000));
		System.out.println(t.descendingKeySet());
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t);
	}

}
