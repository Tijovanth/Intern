package employeePackage;
import java.util.*;
public class Process {
    HashMap<String,HashMap<String,Employee>> dataStore = new HashMap<String,HashMap<String,Employee>>();
    Process()
    {
    	dataStore.put("Sales",new HashMap<String,Employee>());
    	dataStore.put("HumanResource",new HashMap<String,Employee>());
    	dataStore.put("ResearchAndDevelopment",new HashMap<String,Employee>());
    	dataStore.put("Support",new HashMap<String,Employee>());
    }
	public void addEmployee(String department,String firstName, String lastName, long phoneNumber)
	{
		HashMap<String,Employee> tempMap = dataStore.get(department);
		String Name = firstName.concat(lastName);
		tempMap.put(Name,new Employee(firstName,lastName,phoneNumber));
		System.out.println("Employee Created");
		System.out.println();
	}
	public void displayEmployee()
	{
		System.out.println("Employees List:");
		System.out.println("===========================");
    		Set<String>  departmentNames= dataStore.keySet();
    		Iterator itr = departmentNames.iterator();
    		while(itr.hasNext())
    		{
    			String departmentName = (String)itr.next();
    		System.out.println(departmentName+" Department");
    		getNamesList(departmentName);
    		System.out.println("-----------------------------");
    		}
	}
	public void getNamesList(String department)
	{
		HashMap<String,Employee> tempMap = dataStore.get(department);
		Set<String> nameSet = tempMap.keySet();
		Iterator<String> itr = nameSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public void getEmployee(String employeeFirstName, String employeeLastName)
	{
		
    	String employeeName = employeeFirstName.concat(employeeLastName);
    	Set storedDepartment = dataStore.entrySet();
    	Iterator itr = storedDepartment.iterator();
    	boolean check = false;
    	while(itr.hasNext())
    	{
    		Map.Entry<String,HashMap<String,Employee>> tempEntry = (HashMap.Entry<String,HashMap<String,Employee>>)itr.next();
    		HashMap<String,Employee> tempMap = tempEntry.getValue();
    		if(tempMap.containsKey(employeeName))
    		{
    			getEmployeeName(tempEntry.getKey(),employeeName,tempMap);
    			check = true;
    			break;
    		}
    	}
    	if(check == false)
    	{
    		System.out.println("Enter Correct Employee Id");
    		System.out.println();
    	}
	}
	public void getEmployeeName(String department,String employeeName,HashMap<String,Employee> tempMap)
	{
		Employee empObject = tempMap.get(employeeName);
		System.out.println();
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee PhoneNumber: "+empObject.getPhoneNumber());
		System.out.println("Employee Department: "+department+" Department");
		System.out.println();
	}
}

//class MyComparator implements Comparator
//{
//	public int compare(Object ob, Object obj)
//	{
//		Employee e = (Employee) ob;
//		Employee e1 = (Employee) obj;
////		if(e.getName().equals(e1.getName()))
////		{
////			return 1;
////		}else
////		{
////			return 1;
////		}
//		return 1;
//	}
//}
