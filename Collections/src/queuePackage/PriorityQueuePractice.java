package queuePackage;
import java.util.*;
public class PriorityQueuePractice {

	public static void main(String[] args) {
     PriorityQueue pq = new PriorityQueue();
     PriorityQueue pq1 = new PriorityQueue(20,new MyComparator());
     PriorityQueue pq2 = new PriorityQueue();
     for(int i = 0; i < 10; i++)
     {
    	 //System.out.println(pq.offer(i));
    	 pq.offer(i);
     }
     for(int i = 0; i < 10; i++)
     {
    	 //System.out.println(pq1.offer(i));
    	 pq1.offer(i);
     }
     System.out.println(pq.remove());
     System.out.println(pq.poll());
     System.out.println(pq);
     System.out.println(pq.peek());
     System.out.println(pq.element());
     System.out.println(pq);
     System.out.println(pq1);
     System.out.println("++++=+++++++++++++++++++++++++++++++++");
     for(int i = 0; i < 10; i++)
     {
    	 //System.out.println(pq1.offer(i));
    	 pq2.offer(i);
    	 pq2.offer(i);
     }
     System.out.println(pq2);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object ob, Object obj)
	{
		Integer i = (Integer) ob;
		Integer j = (Integer) obj;
		return -i.compareTo(j);
	}
}