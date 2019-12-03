package listPackage;
import java.util.*; 
public class EnumerationPractice {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(1);
		v.add(2);
		v.addElement(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		//v.add(true);
		//v.add(10.9);
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i =(Integer) e.nextElement();
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
//  System.out.println(v);
		System.out.println(e.getClass().getName());
	}

}
