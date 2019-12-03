
interface MyInterface
{
	void abstractFun(int x);
}
interface MyInterface2
{
	int sum(int x);
}
public class LambdaPractice {
	public static void main(String[] args) {
	  MyInterface obj = (int x) -> {System.out.println(x*x);};
      obj.abstractFun(5);
      MyInterface2 ob = (int x) -> x+2;
      System.out.println(ob.sum(3));
	}
}
