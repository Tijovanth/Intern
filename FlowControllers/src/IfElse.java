
public class IfElse {

	public static void main(String[] args) {
		
       int a = 10, b= 20;
    		   if(a == 10)
    			   System.out.println( "a  == 10" );
    		   else
    			   System.out.println("Not equal to 10");
    		   
    	if(a == 10)
    	{
    		if(b == 20)
    		{
    			System.out.println("a is 10 and b is 20");
    		} else
    		{
    			System.out.println("a is not 10 but b is 20");
    		}
    	}
    	else
    	{
    		System.out.println("Both are not equal");
    	}
    	
    	if(a < 10)
    	{
    		System.out.println("a is lesser than 10");
    	} else if(a < 20)
    	{
    		System.out.println("a is lesser than 20");
    	} else
    	{
    		System.out.println("a is greater than 19");
    	}
	}
}
