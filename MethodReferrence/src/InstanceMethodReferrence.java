import java.util.function.BiFunction;
interface MyInterface1
{
	 int say(int a, int b);
}
class Add
{
	 int add(int a, int b)
	{
		return a+b;
	}
	 float add(int a, float b)
	{
		return a + b;
	}
	 float add(float a, float b)
	{
		return a + b;
	}
}
public class InstanceMethodReferrence {

	public static void main(String[] args) {

	   Add a = new Add();
	   MyInterface1 say = a::add;
	   System.out.println(say.say(12, 23));
	   
	   BiFunction<Integer,Integer,Integer> add = new Add()::add;
	   BiFunction<Float,Integer,Float> add1 = new Add()::add;
	   BiFunction<Float,Float,Float> add2 = new Add()::add;
	   
	   System.out.println(add.apply(1, 2));
	   System.out.println(add1.apply(2f,1));
	   System.out.println(add2.apply(23f, 45f));
	}

}
