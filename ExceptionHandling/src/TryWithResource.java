import java.io.FileOutputStream;
public class TryWithResource {

	public static void main(String[] args) {
		    
		try(FileOutputStream fileOutputStream =new FileOutputStream("D:/TryWithResource/abcd.txt")){      
		String msg = "Welcome to javaTpoint!";      
		byte byteArray[] = msg.getBytes();       
		fileOutputStream.write(byteArray);
		byte arr[] = "Tijo".getBytes();
		fileOutputStream.write(arr);
		System.out.println("Message written to file successfuly!");      
		}catch(Exception exception){  
		       System.out.println(exception);  
		}      
		}      
	

	}

