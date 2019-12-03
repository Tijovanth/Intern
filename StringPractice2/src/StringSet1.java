import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringSet1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
         
	    byte[] arr = {65,66,67,69,68};
	    String s = new String(arr,"UTF-8");
	    System.out.println(s);
	    
	    String s1 = new String(arr,Charset.defaultCharset());
	    System.out.println(s1);
	    
	    String s2 = new String(arr,1,4);
	    System.out.println(s2);
	    
	    char[] ar = {'G','R','E','E','C','E'};
	    String s3 = new String(ar,1,3);
	    System.out.println(s3);
	    
	    int[] arr1 = {65,1,2,3};
	    String s4 = new String(arr1,0,3);
	    System.out.println(s4);
	    
	    StringBuffer buffer = new StringBuffer("Tijo");
	    String s5 = new String(buffer);
	    System.out.println(s5);
	    
	    StringBuilder builder = new StringBuilder("tijo");
	    String s6 = new String(builder);
	    System.out.println(s6);
	    
	    String literal = "Tijo";
	    String literal2 = "Tijo";
	    System.out.println(literal + " " + literal2);
	    
	}
}
