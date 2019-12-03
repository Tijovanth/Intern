
public class Employee {
    int id;
    String name;
    Address a;
    Employee(int id, String name, Address a)
    {
    	this.id = id;
    	this.name = name;
    	this.a = a;
    			
    }
    
    public void display(Address a)
    {
    	System.out.println(id+" "+name+" "+a.city);
    }
	public static void main(String[] args) {
		Address newadd = new Address("chennai");
		Employee newemp = new Employee(1,"tijo",newadd);
		newemp.display(newadd);
	}

}
