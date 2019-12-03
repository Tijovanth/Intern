import java.util.InputMismatchException;
import java.util.Scanner;
public class CreditCard {
    Process process = new Process();
	public static void main(String[] args) {
	boolean istrue = true;
	CreditCard creditcard = new CreditCard();
	creditcard.startApplication(istrue);
	}
	void startApplication(boolean istrue)
	{
		if(istrue)
		{
			try {
				Scanner reader = new Scanner(System.in);
				System.out.println("1.Create CreditCard");
				System.out.println("2.Access CreditCard");
				System.out.println("3.Delete CreditCard");
				System.out.println("4.Display Purchase Details");
				System.out.println("5.Exit Application");
				System.out.println("=================================");
				System.out.println("Enter Your Choice");
				int choice = reader.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Your Name");
					String username = reader.next();
					System.out.println("Enter Your EmailId");
					String emailid = reader.next();
					System.out.println("Enter Your Phone Number");
					long phonenumber = reader.nextLong();
					System.out.println("Enter Your Pin Number");
					int pin = reader.nextInt();
					System.out.println("Enter Your Balance Limit is 100k(1,00,000)");
					long balance = reader.nextLong();
					process.addCardDetails(username,emailid,phonenumber,pin,balance);
					System.out.println("=================================");
					break;
				case 2:
					System.out.println("Enter Your Credit Card Number");
					long creditcardnumber = reader.nextLong();
					System.out.println("Enter Your Pin Number");
					int pin_number = reader.nextInt();
					System.out.println("Enter What you purchased");
					String purchaseproducts = reader.next();
					System.out.println("Enter the Amount");
					long amount = reader.nextLong();
					process.accesscard(creditcardnumber, pin_number, purchaseproducts,amount);
					break; 
				case 3:
					System.out.println("Enter Your Credit Card Number");
				    long creditcardnumber_2 = reader.nextLong();
				    process.deletecard(creditcardnumber_2);
					break;
				case 4:
					System.out.println("Enter Your Credit Card Number");
					long creditcardnumber_1 = reader.nextLong();
					process.displayTransactions(creditcardnumber_1);
					break;
				case 5:
					System.out.println("ThankYou For Using This app");
					istrue = false;
					break;
				default:
					System.out.println("Please Enter Available Option");
					break;
				}
			}catch(NullPointerException nu)
			{
				System.out.println("You should Enter Input");
			}catch(InputMismatchException in)
			{
				System.out.println("You should Enter Your Input Correctly");
			}finally
			{
				startApplication(istrue);
			}
		}
	}
}
