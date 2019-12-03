import java.util.*;
public class WildCardCharacter2 {
    
	void someMethod(ArrayList<?> al)
	{
		
	}
	 void someMethod1(ArrayList<? extends Number> al)
	 {
		 
	 }
	 void someMethod2(ArrayList<? super String> al)
	 {
		 
	 }
	public static void main(String[] args) {
		WildCardCharacter obj = new WildCardCharacter();
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Object> al3 = new ArrayList<Object>();
	}

}
