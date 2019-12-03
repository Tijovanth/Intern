
public class StringBuilderClass {

	public static void main(String[] args) {

		
//		 StringBuffer sbr = new StringBuffer("Tijo"); 
//      
//	        String str = sbr.toString(); 
//	        StringBuilder sbl = new StringBuilder(str); 
//	          
//	        System.out.println(sbl); 
		String a = "tito";
		String b = a.substring(0, 1).toUpperCase();
		System.out.println(b);
		a = a.replaceFirst(a.substring(0, 1),b );
		System.out.println(a);
	}

}
