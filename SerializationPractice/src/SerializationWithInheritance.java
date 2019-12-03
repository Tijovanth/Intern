import java.io.*;

class Demo2 implements Serializable
{
//	private static final long serialVersionUID = 1L;
	int a;String b;
	static int c = 10; transient int d;
	Demo2(int a, String b, int d)
	{
		this.a = a;
		this.b = b;
		this.d = d;
	}
	void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Demo1 extends Demo2
{ 
	String child;
	Demo1(int a, String b, int d, String child)
	{
		super(a,b,d);
		this.child = child;
	}
	void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(child);
	}
}
public class SerializationWithInheritance {

	public static void main(String[] args) {
		Demo1 object = new Demo1(1,"parent",2,"child");
		try
        {    
            FileOutputStream file = new FileOutputStream("D:/Tijo.txt"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            out.writeObject(object);
            out.close(); 
            file.close(); 
            System.out.println("Object has been serialized"); 
  
        } catch(IOException e)
	     {
        	System.out.println("IoException is caught");
	     }
        object.d = 200;
        object.a = 100000;
	 try
	 {
		 FileInputStream file = new FileInputStream("D:/Tijo.txt");
		 ObjectInputStream in = new ObjectInputStream(file);
		 Demo1 obj = (Demo1)in.readObject();
		 obj.print();
		 System.out.println("Object has been Deserialized");
	 } catch(Exception e)
	 {
		 System.out.println(e.getMessage());
		 e.printStackTrace();
		 
	 }

	}

}
