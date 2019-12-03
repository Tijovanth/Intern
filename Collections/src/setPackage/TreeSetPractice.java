package setPackage;
import java.util.*;

class Employee implements Comparable
{
	 int id;
	 String name;
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return name+"--"+id;
	}
	public int compareTo(Object obj)
	{
		int emid1 = this.id;
		Employee e = (Employee) obj;
		if(emid1 < e.id)
		{
			return -1;
		}else if(emid1 > e.id)
		{
			return +1;
		}else {return 0;}
	}
}
public class TreeSetPractice {

	public static void main(String[] args) {
      TreeSet t = new TreeSet();
      Employee e1 = new Employee(1,"tijo");
      Employee e2 = new Employee(2,"Kama");
      Employee e3 = new Employee(3,"Ajay");
      Employee e4 = new Employee(4,"vishal");
      t.add(e1);
      t.add(e3);
      t.add(e2);
      TreeSet t1 = new TreeSet(new MyComparator());
      t1.add(e1);
      t1.add(e3);
      t1.add(e2);
      System.out.println(t);System.out.println(t1);
      TreeSet t2 = (TreeSet) t1.clone();
      t2.add(e4);
      System.out.println("=============================================");
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t1.first());
      System.out.println(t1.last());
      System.out.println(t1.size());
      System.out.println(t1.subSet(e3,e2));
      System.out.println(t1.tailSet(e2));
      System.out.println(t1.headSet(e3));
      TreeSet t3 = new TreeSet();
     // t3.add(null);
     // t3.add(null);
     // t3.add(1);
      System.out.println(t3);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee e = (Employee)obj1;
		Employee e1 = (Employee)obj2;
	    return e.name.compareTo(e1.name);
	}
}