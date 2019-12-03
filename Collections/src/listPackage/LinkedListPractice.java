package listPackage;
import java.util.*;
public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<String> studentList = new LinkedList<String>();
		System.out.println(studentList.size());
		studentList.add("john");
		studentList.add(0, "Tijo");
		studentList.forEach(student -> System.out.print(student+" "));
		System.out.println();
		studentList.addFirst("amy");
		studentList.forEach(student -> System.out.print(student+" "));
		System.out.println("removed name "+studentList.remove()); //removes the head
		System.out.println();
		studentList.addLast("zimy");
		studentList.forEach(student -> System.out.print(student+" "));
		System.out.println();
		//studentList.sort(null);
		studentList.forEach(student -> System.out.print(student+" "));
		System.out.println();
		Iterator<String> studentListIterator=  studentList.descendingIterator();
		while(studentListIterator.hasNext()) {
		System.out.print(studentListIterator.next()+" ");
		}
		System.out.println();
		System.out.println(studentList.element());
		studentList.offer("jack");
		studentList.forEach(student -> System.out.print(student+" "));
		System.out.println();
		studentList.offerLast("jack");
		studentList.forEach(student -> System.out.print(student+" "));
		System.out.println();
		System.out.println(studentList.peek()); //retrieves the head.
		System.out.println(studentList.poll()); //retrieves and removes the head

		studentList.forEach(student -> System.out.print(student+" "));
		System.out.println();
		System.out.println(studentList.pop()); //similar to removeFirst .
		System.out.println(studentList.removeFirstOccurrence("zimy"));
		Collections.sort(studentList);
		System.out.println();
		studentList.forEach(student -> System.out.print(student+" "));
		studentList.toArray();
		System.out.println(studentList);
	}

}
