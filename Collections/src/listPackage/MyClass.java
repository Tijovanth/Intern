package listPackage;
import java.util.*;
public class MyClass {
	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(5);	
    list.add(1);
    list.add(2);
   // list.add("tijo");
    list.add(4);
    list.add(5);
    int a =(int) list.get(0);
  //  String b = list.get(2);
   // System.out.println(b);
    Collection<String> al = new ArrayList<String>();
    List<String> al1 = new ArrayList<String>();
    Collection<Object> al2 = new ArrayList<Object>();
   // Collection<Object> al2 = new ArrayList<String>();
	}
}
