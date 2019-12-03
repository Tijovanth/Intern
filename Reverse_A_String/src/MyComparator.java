import java.util.*;
class MyComparator implements Comparator{

	public int compare(Object ob, Object obj)
	{
		String s = ob.toString();
		String s1 = obj.toString();
		 if(s.compareTo(s1) == 0)
		 {
			 return 1;
		 }else
		 {
			 return s.compareTo(s1);
		 }
	}
	
}
