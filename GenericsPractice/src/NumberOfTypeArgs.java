import java.util.ArrayList;

class MyCla1 
{
	void dis()
	{
		System.out.println("MyCla1");
	}
}
class MyClas2
{
	void dis2()
	{
		System.out.println("MyClas2");
	}
}
public class NumberOfTypeArgs<T extends MyCla1 , U extends MyClas2> {
	 
	T var;
	U var1;
	NumberOfTypeArgs(T ob, U ob2)
	{
		var = ob;
		var1 = ob2;
	}
    void show()
    {
    	var.dis();
    	var1.dis2();
    }
    
//    void some(ArrayList<Integer,String> a)
//    {
//    	
//    }
//    void some(ArrayList<Integer> a)
//    {
//    	
//    }
	public static void main(String[] args) {
		
		NumberOfTypeArgs<MyCla1,MyClas2> object = new NumberOfTypeArgs<>(new MyCla1(),new MyClas2());
		object.show();
		ArrayList al = new ArrayList<String>();
		al.add("String");
		al.add(1);
	}

}
