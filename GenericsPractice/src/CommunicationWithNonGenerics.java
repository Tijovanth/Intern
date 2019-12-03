import java.util.*;

class Test<T>
{
	T var;
	Test(T var)
	{
		this.var = var;
	}
	void function()
	{
		System.out.println(var.getClass().getName());
	}
}
public class CommunicationWithNonGenerics {
	public ArrayList method(ArrayList al)
	{
		LinkedList lil = new LinkedList();
		al.add(10);
		al.add(10.5);
		al.add(20.5F);
		al.add(true);
		al.add(lil);
		return al;
	}
	
	 Test someFuntion(Test t)
	{
		 t = new Test(12);
		return t;
	}
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
        al.add("Tijo");
        al.add("vanth");
        CommunicationWithNonGenerics object = new CommunicationWithNonGenerics();
        al =  object.method(al);
        al.add("Ranga");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        Test<String> testob = new Test("Tijo");
        Test<?> to = object.someFuntion(testob);
        System.out.println(testob.var);
        System.out.println(to.var);
        }
}
