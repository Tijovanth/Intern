package employeePackage;

public class Employee {
    private String firstName;
    private String lastName;
    private long phoneNumber;
	public Employee(String first, String last, long phone)
	{
		firstName = first;
		lastName = last;
		phoneNumber = phone;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getName()
	{
		return firstName.concat(lastName);
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
}