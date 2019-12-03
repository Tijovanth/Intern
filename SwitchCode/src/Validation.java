import java.util.*;
public class Validation {
      MyValidation validation = new MyValidation();
	void startApplication(boolean value)
	{
	  try
	  {
		 value =  validation.validate(value);
	  }catch(Exception e)
	  {
		  System.out.println("Enter Your Input Correctly");
	  }finally
	  {
		  if(value == true)
		  startApplication(value);
	  }
	}
	public static void main(String[] args) {
		
         Validation object = new Validation();
         object.startApplication(true);
	}

}

class MyValidation
{
	boolean validate(boolean value) throws Exception
	{    
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Name");
		System.out.println("2.PhoneNumber");
		System.out.println("3.Pincode");
		System.out.println("4.Exit");
		System.out.println("Enter the number which you want to change");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			boolean value3 = true;
			while(value3)
			{
				System.out.println("Enter Your Name");
				System.out.println("You should enter your FirstName and LastName");
				String firstname = sc.next();
				String lastname = sc.next();
				if(firstname.length() > 4 || lastname.length() > 4 || firstname == null || lastname == null)
				{
					System.out.println("Please Enter your name Correctly");
				}else
				{
					System.out.println("Validation Suceed");
					value3 = false;
				}
				
			}
			break;
		case 2:
			boolean value1 = true;
			while(value1)
			{
			System.out.println("Enter Your Phonenumber");
			Long phonenumber = sc.nextLong();
		    if(String.valueOf(phonenumber).length() == 10)
		    {
		    	System.out.println("You Entered Correctly Validation Process also Succeed");
		    	value1 = false;
		    } else
		    {
		    	System.out.println("Enter the Correct PhoneNumber");
		    }
			}
			break;
		case 3:
			boolean value2 = true;
			while(value2)
			{
			System.out.println("Enter Your Pincode");
			Long pincode = sc.nextLong();
		    if(String.valueOf(pincode).length() == 6)
		    {
		    	System.out.println("You Entered Correctly Validation Process also Succeed");
		    	value2 = false;
		    } else
		    {
		    	System.out.println("Enter the Correct PhoneNumber");
		    }
			}
			break;
		case 4:
			value = false;
			sc.close();
			break;
		default:
			System.out.println("Enter Valid Number");
			break;
		}
		
		return value;
	}
}
