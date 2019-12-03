package listPackage;
import java.util.*;
public class ArrayListPractice {
     
//	 int hashCode(Integer value)
//	{
//		return value * 5;
//	}
	public static void main(String[] args) {
		ArrayListPractice ob = new ArrayListPractice();
		ArrayList<String> employeeDetails = new ArrayList<String>();
		employeeDetails.add("Tijo");
		employeeDetails.add("vanth");
		employeeDetails.add("kama");
		ArrayList<String> bothEmployeeAndManager = new ArrayList<String>();
		bothEmployeeAndManager.add("Rechal");
		bothEmployeeAndManager.add("john");
		//  Traversing through forEach method
		employeeDetails.forEach((details)  ->System.out.println(details));
		//  Traversing through iterator
		Iterator<String> arrayListIterator = employeeDetails.iterator();
		while(arrayListIterator.hasNext()) {
		System.out.println(arrayListIterator.next());
		}
		// Traversing through listIterator

		ListIterator<String> arrayListListIterator = employeeDetails.listIterator();
		while(arrayListListIterator.hasNext()) {
		System.out.println(arrayListListIterator.next());
		}
		while(arrayListListIterator.hasPrevious()) {
		System.out.println(arrayListListIterator.previous());
		System.out.println("heheh");
		}
		System.out.println(employeeDetails.size());
		// System.out.println( employeeDetails.remove(0)); //prints the removed element and the next element takes this index
		//  System.out.println(employeeDetails.get(0));//now it prints index 1 element.
//		       employeeDetails.removeIf(name -> name.equals("john"));
//		       employeeDetails.forEach((details)  ->System.out.println(details));
		System.out.println( employeeDetails.contains("rechal"));
		System.out.println(employeeDetails.retainAll(bothEmployeeAndManager));
		bothEmployeeAndManager.forEach(person -> System.out.println(person));
//        Integer one = new Integer(2);
//        System.out.println(ob.hashCode(one));
	}
}