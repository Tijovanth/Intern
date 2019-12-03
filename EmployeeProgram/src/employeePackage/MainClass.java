package employeePackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    Process process = new Process();
	public void startApplication(boolean value)
	{
	if(value)
	{
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.Create an Employee");
			System.out.println("2.Display an Employee List");
			System.out.println("3.Display Specific Employee Details");
			System.out.println("4.Exit");
			System.out.println("============================");
			System.out.println("Enter Your Choice");
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the FirstName");
				String firstName = scanner.next();
				System.out.println("Enter the LastName");
				String lastName = scanner.next();
				System.out.println("Enter The Phone Number");
				long phoneNumber = scanner.nextLong();
				System.out.println("Choose department:");
				System.out.println("1.Sales Department");
				System.out.println("2.Human Resource Department");
				System.out.println("3.Research and Development");
				System.out.println("4.Technical Support");
				System.out.println("============================");
				System.out.println("Enter The Choice");
				int department = scanner.nextInt();
				switch(department)
				{
				case 1:
					process.addEmployee("Sales",firstName,lastName,phoneNumber);
					break;
				case 2:
					process.addEmployee("HumanResource",firstName,lastName,phoneNumber);
					break;
				case 3:
					process.addEmployee("ResearchAndDevelopment",firstName,lastName,phoneNumber);
					break;
				case 4:
					process.addEmployee("Support",firstName,lastName,phoneNumber);
					break;
				default:
					System.out.println("Enter Valid Choice");
				}
				break;
			case 2:
				process.displayEmployee();
				break;
			case 3:
				System.out.println("Enter Employee First Name");
				String employeeFirstName = scanner.next();
				System.out.println("Enter Employee Last Name");
				String employeeLastName = scanner.next();
				process.getEmployee(employeeFirstName,employeeLastName);
				break;
			case 4:
				System.out.println("ThankYou");
				value = false;
				scanner.close();
				break;
			default:
				System.out.println("Invalid Choice");
				}
		}catch(Exception e)
		{
			if(e instanceof NullPointerException)
			{
				System.out.println("Occurs NullPointer Exception");
			}else if(e instanceof InputMismatchException)
			{
				System.out.println("Occurs InputMismatch Exception");
			}
		}finally
		{
			startApplication(value);
		}
	}
	}
	public static void main(String[] args) {
		boolean isTrue = true;
		MainClass object = new MainClass();
		object.startApplication(isTrue);
	}

}
