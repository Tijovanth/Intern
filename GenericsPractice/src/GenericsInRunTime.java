import java.util.*;
class Test1<T>
{
	T var;
	Test1(T var)
	{
		this.var = var;
	}
}
public class GenericsInRunTime {  
//	String someMethod(Test<String> l)
//	{
//		return "Tijo";
//	}                     In time run time both are same methods because generic are not applicable in runtime
//	int someMethod(Test<Integer> l)
//	{
//		return 1;
//	}
	public static void main(String[] args) {
       ArrayList al = new ArrayList<Integer>();
       ArrayList al1 = new ArrayList<Double>();
       ArrayList al2 = new ArrayList();
       ArrayList<String> al3 = new ArrayList<>();
       ArrayList<String> al4 = new ArrayList<String>();
       //Test<String> to = new Test<String>("Tijo");
       Test<String> to = new Test<>("Tijo");// above line and this line are equal
//       Test to1 = new Test<String>("1"); 
        Test to1 = new Test<>(1);
//       Test to1 = new Test<Integer>(1);above two lines and this line are equal
      //  to1.var = "Tijo";Because Compiler Checks the Referrence so here we didn't provide any specific type so that's why are getting no errors
       //to.var = 1;Here we are getting errors because we provide type in paras
	}
}
