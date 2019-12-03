
public class Parsing {

	public static void main(String[] args) {
      Integer a = null;
      String result2 = String.valueOf(a);
      System.out.println(result2 instanceof String);
//      String result1 = new Integer(a).toString();
//      System.out.println(result1 instanceof String);
//      String result = Integer.toString(a);
//      System.out.println(result instanceof String);
      //if the value is null String.valueOf() return Null But to String Method returns NUllpointerException
      int a1 = 123;
      String  str = new StringBuffer().append(a).toString();
      System.out.println(str instanceof String);
      int a2 = 255;
      String result = Integer.toBinaryString(a2);
      String result1 = Integer.toHexString(a2);
      String result3 = Integer.toOctalString(a2);
      System.out.println(result + " " + result1 + " " + result3);
      float d = 12.3f;
      //System.out.println(Float.toString(f)); cause an error
      System.out.println(Double.toString(d));
	}
}
