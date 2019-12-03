
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo3 
{
//	private static final long serialVersionUID = 1L;
	int a;String b;
	transient static int c = 10; transient final  int d = 10000;
	Demo3(int a, String b)
	{
		this.a = a;
		this.b = b;
		
	}
	Demo3()
	{
		
	}
	void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Demo4 extends Demo3 implements Serializable
{ 
	private static final long serialVersionUID = 101L;
	transient final int child;
	Demo4(int a, String b, int child)
	{
		super(a,b);
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
public class SerializationwithInheritance2 {

	public static void main(String[] args) {
		Demo4 object = new Demo4(1,"parent",365);
		try
        {    
            FileOutputStream file = new FileOutputStream("D:/Tijo.txt"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            out.writeObject(object);
            object.print();
            out.close(); 
            file.close(); 
            System.out.println("Object has been serialized"); 
  
        } catch(IOException e)
	     {
        	System.out.println("IoException is caught");
	     }
        object.a = 100000;
	 try
	 {
		 FileInputStream file = new FileInputStream("D:/Tijo.txt");
		 ObjectInputStream in = new ObjectInputStream(file);
		 Demo4 obj = (Demo4)in.readObject();
		 obj.print();
		 System.out.println("Object has been Deserialized");
		 in.close();
		 file.close();
	 } catch(Exception e)
	 {
		 System.out.println(e.getMessage());
		 e.printStackTrace();
		 
	 }

	}

}

