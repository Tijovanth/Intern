import java.util.function.BiFunction;
interface MyInterface
{
	 void say();
}
class Arithmetic
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static float add(int a, float b)
	{
		return a + b;
	}
	static float add(float a, float b)
	{
		return a + b;
	}
}
public class StaticMethodReferrence {

	static void saySomething()
	{
		System.out.println("Hai Iam Tijovanth");
	}
	public static void main(String[] args) {
     
	  MyInterface say = StaticMethodReferrence::saySomething;
	  say.say();
	  BiFunction<Integer,Integer,Integer> add = Arithmetic::add;
	  BiFunction<Float,Integer,Float> add1 = Arithmetic::add;
	  BiFunction<Float,Float,Float> add2 = Arithmetic::add;
	  System.out.println(add.apply(1, 2));
	  System.out.println(add1.apply(2f,1));
	  System.out.println(add2.apply(23f, 45f));
	}
}
