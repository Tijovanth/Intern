
public class TypeCasting {

	public static void main(String[] args) {
       //implicit Conversion
		int a = 257;
		long l = a;
		System.out.println(l);
		//explicit Conversion 
		char c = 'c';
		 c = (char) a;
		System.out.println(a);
		double d = 200.0d;
		//fractional part will be lost
		long l1 = (long)d;
		System.out.println(l1);
		//range of values will reduced to 256
		byte b  = (byte) a;
		byte b1 = (byte) d;
		System.out.println(b + " " + b1);
		// in expression if one of the value is double or long or float whole value change to respectively
		int sum = 10;
		long sum1 = 100;
		double sum2 = 200.00d;
		System.out.println(sum + sum1 + sum2);
		// when we try to store larger values to the smaller it will generate compile time error
		byte result =(byte) (sum + sum1);
		System.out.println(result);
	}
}
