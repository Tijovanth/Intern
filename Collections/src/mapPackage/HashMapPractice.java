package mapPackage;
import java.util.*;
public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		HashMap hm1 = new HashMap(20);
		HashMap hm2 = new HashMap(20,1.23f);
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
        HashMap hm4 = (HashMap)hm.clone();
        //hm4.remove("Tijo");
        System.out.println("==============");
        System.out.println(hm4);
        System.out.println(hm);
        System.out.println("==============");
        System.out.println(hm.remove(1));
        System.out.println(hm4);
        System.out.println(hm);
	}
}
