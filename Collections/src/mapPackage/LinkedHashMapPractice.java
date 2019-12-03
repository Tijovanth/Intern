package mapPackage;
import java.util.*;
public class LinkedHashMapPractice {

	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap();
		LinkedHashMap hm1 = new LinkedHashMap(20);
		LinkedHashMap hm2 = new LinkedHashMap(20,1.23f);
		hm.put(1,"tijo");
		hm.put("Tijo",1);
		hm.put(3, "kama");
		//hm.put(null,null);
		//System.out.println(hm.put(null,null));
		System.out.println(hm);
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
        	Map.Entry me = (Map.Entry) itr.next();
        	System.out.println(me.getKey()+" "+me.getValue());
        	if(me.getValue().equals("kama"))
        	{
        		me.setValue("vanth");
        	}
        }
        System.out.println(hm);
        Set s1 = hm.keySet();
        System.out.println(s1);
        Collection c = hm.values();
        System.out.println(c);
        System.out.println(hm.size());
        LinkedHashMap hm4 = (LinkedHashMap)hm.clone();
        hm4.remove("Tijo");
        System.out.println(hm4);
        System.out.println(hm);
        System.out.println(hm.remove(1));
        System.out.println(hm4);
        System.out.println(hm);


	}

}
