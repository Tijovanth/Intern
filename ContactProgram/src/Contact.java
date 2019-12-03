import java.util.*;
public class Contact {

	HashMap<Long,String> contacts = new HashMap<>();
	public void startProgram(boolean value)
	{
	   if(value)
	   {
		   try
		   {
			   Scanner scanner = new Scanner(System.in);
			   System.out.println("1.Create a contact");
			   System.out.println("2.Display Contacts");
			   System.out.println("3.Exit");
			   System.out.println("Enter Your Choice");
			   int choice = scanner.nextInt();
			   switch(choice)
			   {
			   case 1:
				   System.out.println("Enter Your Phone Number");
				   long phoneNumber = scanner.nextLong();
				   System.out.println("Enter the Name");
				   String name = scanner.next();
				   if(contacts.containsKey(phoneNumber))
				   {
					   System.out.println("Already registered phonenumber");
				   }else
				   {
					   contacts.put(phoneNumber,name);
					   System.out.println("Contact created");
				   }
				   break;
			   case 2:
				   System.out.println("Contacts");
				   System.out.println("=====================");
				   Set<Map.Entry<Long,String>> tempEntry = contacts.entrySet();
				   Iterator itr = tempEntry.iterator();
				   while(itr.hasNext())
				   {
					   HashMap.Entry<Long,String> tempMap = (HashMap.Entry<Long,String>) itr.next();
					   System.out.println("Name: "+tempMap.getValue());
					   System.out.println("PhoneNumber :"+tempMap.getKey());  
					   System.out.println();
				   }
				   break;
			   case 3:
				   value = false;
				   scanner.close();
				   break;
			   default:
				   System.out.println("Enter Correct Option");
			   }
		   }catch(NullPointerException e)
		   {
			   System.out.println("Null Pointer Exception");
		   }catch(InputMismatchException in)
		   {
			   System.out.println("Input Mis Match Exception");
		   }finally
		   {
			   startProgram(value);
		   }
	   }
	}
	public static void main(String[] args) {
		boolean isTrue = true;
		Contact object = new Contact();
		object.startProgram(isTrue);
	}

}
