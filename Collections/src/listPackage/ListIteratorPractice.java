package listPackage;
import java.util.*;
public class ListIteratorPractice {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Tijo");
		l.add("Kama");
		l.add("Ajay");
		l.add("jai");
		ListIterator ltr = l.listIterator();
		System.out.println(l);
		while(ltr.hasNext())
		{
			String name = (String) ltr.next();
			System.out.println(ltr.nextIndex());
			if(name.equals("Tijo"))
			{
				ltr.add("vanth");
			}else if(name.equals("Kama"))
			{
				ltr.remove();
			}else if(name.equals("Ajay"))
			{
				ltr.set("Pambu");
			}
		}
		System.out.println(l);
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous()+ " " + ltr.previousIndex());
		}
		while(ltr.hasNext())
		{
			System.out.println(ltr.next()+ " " + ltr.nextIndex());
		}
		System.out.println(ltr.getClass().getName());
	}

}
