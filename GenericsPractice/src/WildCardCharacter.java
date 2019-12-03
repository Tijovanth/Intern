import java.util.*;

class Experiment<T>
{
	T var;
	Experiment(T var)
	{
		this.var = var;
	}
	void method()
	{
		System.out.println(var);
	}
}
public class WildCardCharacter {

	void someMethod(Experiment<? super String> t)
	{
		t.method();
	}
	
	void somemethod(Experiment<? extends Number> n)
	{
		n.method();
	}
	public static void main(String[] args) {
		WildCardCharacter ob = new WildCardCharacter();
		Experiment<? super String> obj = new Experiment<>(10.5);//So here Superclass of string is object and is super class for every class in java so we can provide any thing
	   //Experiment<Object> obj = new Experiment<>("tijo");
		//Experiment<String> obj = new Experiment<>("tijo");//so these lines are applicable
		ob.someMethod(obj);
		Experiment<Integer> obj1 = new Experiment<>(1);
		//Experiment<Double> obj1 = new Experiment<>(2.5); this will applicable
		ob.somemethod(obj1);
	}
}
