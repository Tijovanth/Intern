package mapPackage;
import java.util.*;
public class ShallowCopy {

	public static void main(String[] args) {
      HashMap<String,LinkedList<String>> map = new HashMap<>();
      LinkedList<String> list = new LinkedList<>();
      list.add("t");
      list.add("i");
      list.add("j");
      list.add("o");
      map.put("Tijo",list);
      HashMap map1 = (HashMap)map.clone();
      LinkedList<String> list1 = (LinkedList) map1.get("Tijo");
      list1.remove();
      list1.remove();
      System.out.println(list1);
      System.out.println(list);
      
      ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
      ArrayList<String> arr1 = new ArrayList<>();
      arr1.add("Tijo");
      arr1.add("Kama");
      arr1.add("vath");
      arr.add(arr1);
      arr.add(arr1);
      
      ArrayList arr2 =(ArrayList) arr.clone();
      arr2.remove(0);
      System.out.println(arr);
      System.out.println(arr2);
	}

}
