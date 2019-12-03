
public class StringOutBound {

	public static void main(String[] args) {
       
		 try { 
	            String a = "Iam Tijovanth";
	            char c = a.charAt(24); 
	            System.out.println(c); 
	        } 
	        catch(StringIndexOutOfBoundsException e) { 
	            System.out.println("String Out of Bound Please Correct it"); 
	        }
	}

}
