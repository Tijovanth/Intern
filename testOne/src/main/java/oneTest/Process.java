package oneTest;

import java.util.Map;
import java.util.regex.Pattern;

public class Process {
	 public  boolean addCardDetails(String username, String emailid, long phonenumber, int pin, long balance,Map map) {
	        if((Pattern.matches("[a-zA-Z0-9\\W]+@[a-zA-Z]+.[a-z]{3}", emailid)) != true)
	        {
	            System.out.println("Check your Entered Email Id.. You should Enter Correct Email ID");
	            return  false;
	        } else if(String.valueOf(pin).length() != 4)
	        {
	            System.out.println("Check your Pin number ... Pin number Should contains 4 numbers only");
	            return false;
	        } else if(balance > 100000 || balance < 0)
	        {
	            System.out.println("Check Your Balance Balance limit is 1k and it should not be less than 0");
	            return false;
	        } else
	        {
	            map.put((long) 1234567890,"Tijo");
	            System.out.println("Credit card Created...ThankYou");
	            return true;
	        }
	    }
	  public   boolean accesscard(long creditcardnumber,int pin_number, Map map)
	    {
	        if(map.containsKey(creditcardnumber))
	        {
	            String tempstorage = (String) map.get(creditcardnumber);
	            int temp = tempstorage.length();
	            if(pin_number != 1234)
	            {
	                System.out.println("Enter Valid Pin Number");
	                return  false;
	            }else
	            {
	                int balance = tempstorage.indexOf('T');
	                System.out.println(balance);
	                if(balance != 0)
	                {
	                    System.out.println("Insufficient Balance");
	                    return false;
	                }else
	                {
	                    System.out.println("ThankYou for using our Credit card");
	                    return true;
	                }
	            }
	        }else
	        {
	            System.out.println("Enter Valid Card Number");
	            return false;
	        }
	    }
	  public  boolean deletecard(long creditcardnumber, Map map)
	    {
	        if(map.containsKey(creditcardnumber))
	        {
	            map.remove(creditcardnumber);
	            System.out.println("Your Card Has Been Deleted");
	            return true;
	        }else
	        {
	            System.out.println("Enter Valid creditcard Number");
	            return false;
	        }
	    }
	  
	}
