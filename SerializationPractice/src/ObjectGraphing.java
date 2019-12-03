import java.io.*;
class Serial1 implements Serializable { 
     Serial2 s2 = new Serial2();  
} 
  

class Serial2 implements Serializable { 
     Serial3 s3 = new Serial3();  
} 
  
class Serial3 implements Serializable { 
     int i = 10; 
     int j = 20; 
} 
public class ObjectGraphing {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Serial1 s1 = new Serial1(); 
	     FileOutputStream fos = new FileOutputStream("D:/Tijo.txt"); 
	     ObjectOutputStream oos = new ObjectOutputStream(fos);
	     oos.writeObject(s1); 
	     fos.close(); 
	     oos.close(); 
	     FileInputStream fis = new FileInputStream("D:/Tijo.txt"); 
	     ObjectInputStream ois = new ObjectInputStream(fis);     
	     Serial1 serobject = (Serial1) ois.readObject();
	     fis.close(); 
	     ois.close(); 
	     System.out.println("Value of i after Serialization" +  
	                               " is " + serobject.s2.s3.i); 
	     System.out.println("Value of j after Serialization" +  
	                                " is "+serobject.s2.s3.j); 

	}

}
