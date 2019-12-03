import java.util.*;
import java.util.regex.Pattern;
class Process {
	static long creditcardnumber = 2827109234569820l;
	Map<Long,UserCreditCard> usercreditcard_details = new HashMap<Long,UserCreditCard>();
	String[] bankName = {"IndianBank","StateBankofIndia","ICICIBank","AxisBank","HDFCBank"};
	void addCardDetails(String username, String emailid, long phonenumber, int pin, long balance)
	{
		if((Pattern.matches("[a-zA-Z0-9\\W]+@[a-zA-Z]+.[a-z]{3}", emailid)) != true)
		{
			System.out.println("Check your Entered Email Id.. You should Enter Correct Email ID");
		} else if(String.valueOf(pin).length() != 4)
		{
			System.out.println("Check your Pin number ... Pin number Should contains 4 numbers only");
		} else if(balance > 100000 || balance < 0)
		{
			System.out.println("Check Your Balance Balance limit is 1k and it should not be less than 0");
		} else
		{
			usercreditcard_details.put(creditcardnumber,new UserCreditCard(username,emailid,phonenumber,pin,balance,creditcardnumber));
			System.out.println("Credit card Created...ThankYou");
			System.out.println("Please Note Your  16 digit CardNumber : "+creditcardnumber);
			System.out.println("=============================================================");
			creditcardnumber += 5;
		}
	}
	void accesscard(long creditcardnumber,int pin_number,String purchaseproducts,long amount)
	{
		if(usercreditcard_details.containsKey(creditcardnumber))
		{
			UserCreditCard tempstorage = usercreditcard_details.get(creditcardnumber);
			int temp = tempstorage.getPinNumber();
			if(temp != pin_number)
			{
				System.out.println("Enter Valid Pin Number");
			}else
			{
				long balance = tempstorage.getBalance();
				if(balance < amount)
				{
					System.out.println("Insufficient Balance");
				}else
				{
				tempstorage.minusBalance(amount);
				tempstorage.setProducts(purchaseproducts);
   			    System.out.println("ThankYou for using our Credit card");
   			    System.out.println("Your Current Balance: "+tempstorage.getBalance());
				}
			}
		}else
		{
			System.out.println("Enter Valid Card Number");
		}
	}
	
	
	void deletecard(long creditcardnumber)
	{
		if(usercreditcard_details.containsKey(creditcardnumber))
		{
			usercreditcard_details.remove(creditcardnumber);
			System.out.println("Your Card Has Been Deleted");
		}else
		{
			System.out.println("Enter Valid creditcard Number");
		}
	}
	void displayTransactions(long creditcardnumber)
	{
		if(usercreditcard_details.containsKey(creditcardnumber))
		{
			UserCreditCard tempstorage = usercreditcard_details.get(creditcardnumber);
			LinkedList<String> templist = tempstorage.getProducts();
			System.out.println("==========================");
			System.out.println("Username: "+tempstorage.getUsername());
			System.out.println("Email Id: "+tempstorage.getEmailId());
			System.out.println("Phone Number: "+tempstorage.getPhoneNumber());
			System.out.println("Your Purchased Products");
		    tempstorage.getCreditCardNumber();
			for(String products : templist)
			{
				System.out.println(products);
			}
			System.out.println("==========================");
		}else
		{
			System.out.println("Enter Valid Credit card Number");
		}
	}	
}
