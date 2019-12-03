import java.io.*;


class Sample implements Serializable
{
	transient int pwd;
	String username;
	Sample(int i, String j)
	{
		pwd = i;
		username = j;
	}
	  private void writeObject(ObjectOutputStream oos) throws Exception 
	    { 
	        oos.defaultWriteObject();
	        String epwd = "123" + pwd; 
	        oos.writeObject(epwd); 
	    } 
	  private void readObject(ObjectInputStream ois) throws Exception 
	    {  
	        ois.defaultReadObject(); 
	        String epwd = (String)ois.readObject(); 
	        pwd = Integer.valueOf(epwd.substring(3)); 
	    }
}
public class CustomizedSerialization {

	public static void main(String[] args) {
		Sample obj = new Sample(12,"Tijo");
		try
		{
			 FileOutputStream file = new FileOutputStream("D:/Tijo.txt"); 
	            ObjectOutputStream out = new ObjectOutputStream(file); 
	            out.writeObject(obj);
	            out.close();
	            file.close();
	            System.out.println("Object has been Serialized");
		}catch(Exception e)
		{
			System.out.println("caught");
		}
		
		try
		{
			 FileInputStream file = new FileInputStream("D:/Tijo.txt");
			 ObjectInputStream in = new ObjectInputStream(file);
			 Sample obj1 = (Sample)in.readObject();
			 System.out.println("Object has been Deserialized");
			 System.out.println(obj1.pwd);
			 System.out.println(obj1.username);
			 in.close();
			 file.close();
		}catch(Exception e)
		{
			System.out.println("caught");
		}

	}

}
