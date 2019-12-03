import java.util.InputMismatchException;
import java.util.Scanner;

public class Capitalize{
        public boolean capitalize(boolean value)  
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter The  Input");
        	String input = sc.nextLine();
        	try
        	{
        	    Integer.valueOf(input);
        	    throw new InputMismatchException();
        			
        	} catch(NumberFormatException e)
        	{
        		String inputarray[] = input.split(" ");
            	for(int i = 0; i < inputarray.length; i++)
            	{
            		String firstletter = inputarray[i].substring(0,1).toUpperCase();
            		String lastletter = inputarray[i].substring(inputarray[i].length()-1,inputarray[i].length()).toUpperCase();
            		inputarray[i] = inputarray[i].replaceFirst(inputarray[i].substring(0, 1),firstletter);
            		inputarray[i] = inputarray[i].substring(0,inputarray[i].length()-1)+lastletter;
            		//inputarray[i] = inputarray[i].substring(0,1).toUpperCase()+inputarray[i].substring(1, inputarray[i].length()-1)+inputarray[i].substring(inputarray[i].length()-1,inputarray[i].length()).toUpperCase();
            		
            	}
            	for(int i = 0; i < inputarray.length; i++)
            	{
            		System.out.print(inputarray[i]+" ");
            	}
                
                return value = false;
        	}
        	catch(InputMismatchException er)
        	{
        		System.out.println("Enter the input Correctly");
        		return value = true;
        	}
        	finally
        	{ 
        		if(value == true)
        		value = capitalize(value);
        	}
        }
	public static void main(String[] args) throws Exception   {
		Capitalize object =new  Capitalize();
		boolean value = true;
        	value = object.capitalize(value);      
	}
}
