
public class MethodOverriding{
	static void printSalary(MyOtherClass e) 
    { 
        System.out.println(e.salary()); 
    } 

public static void main(String[] args) 
{ 
    MyOtherClass obj1 = new Manager();
    System.out.print("Manager's salary : "); 
    printSalary(obj1); 
    //obj1.dis();

    MyOtherClass obj2 = new Clerk(); 
    System.out.print("Clerk's salary : "); 
    printSalary(obj2); 
}
}
class Manager extends MyOtherClass { 
    int salary() 
    { 
        return base + 20000; 
    } 
    
    static void dis()
    {
    	System.out.println("Manager dis");
    }
}
class Clerk extends MyOtherClass { 
    int salary() 
    { 
        return base + 10000; 
    } 
}