
public class WrapperClass {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		int j = i; //unboxing
		int a = 10;
		Integer b = a; //autoboxing
		Float f = (float) j;
		Double d = (double) f;// we need to boxing and widening 
	}
}
