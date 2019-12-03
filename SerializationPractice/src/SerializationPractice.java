import java.io.*;
import java.io.Serializable;

class Demo implements Serializable
{
	int a;String b;
	static int c = 10; transient int d;
	Demo(int a, String b, int d)
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
public class SerializationPractice {

	public static void main(String[] args) {
		Demo object = new Demo(1, "something",20);
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
			 Demo obj = (Demo)in.readObject();
			 obj.print();
			 System.out.println("Object has been Deserialized");
			 in.close();
			 file.close();
		 } catch(Exception e)
		 {
			 System.out.println("excdeption caught");
		 }

	}

}
