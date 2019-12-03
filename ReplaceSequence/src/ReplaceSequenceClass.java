import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ReplaceSequenceClass {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String");
      String paragraph="";
      while(sc.hasNextLine()){           
    	  String test = sc.nextLine();
    	  if(test.equals("exit"))
    	  {
    		 break;
    	  }
    	  paragraph += test;
    	  paragraph +=" ";
	}
      System.out.println(paragraph);
      paragraph.trim();
     String[] paraArray = paragraph.split(" ");
     ArrayList<String> paraList = new ArrayList<String>(paraArray.length);
     for(int j = 0; j < paraArray.length; j++)
     {
    	  paraList.add(paraArray[j]);
     }
     System.out.println("Enter The Sequence you want to remove");
     String remove = sc.nextLine();
     String[] removeArray = remove.split(" ");
     boolean value = true;
   outer:  for(int j = 0; j < paraArray.length; j++)
     {
    	 if(paraArray[j].equals(removeArray[0]))
    	 {
    		 if((paraArray.length - j) >= removeArray.length)
    		 {
    		 int index = j;
    		 boolean flag = true;
    	inner:	 for(int k = 0; k < removeArray.length; k++)
    		 {
    			 if(!paraArray[index].equals(removeArray[k]))
    			 {
    				 flag = false;
    				 break inner;
    			 }
    			 index++;
    		 }
    		 if(flag == true)
    		 {
    			 value = true;
    			 int temp = j;
    			 int temp2 = j;
    			 System.out.println("Enter the Sequence you want to replace");
    		     String replace = sc.nextLine();
    		     String[] replaceArray = replace.split(" ");
    		     for(int g = 0; g < replaceArray.length; g++)
    		     {
    		     paraList.set(temp2,replaceArray[g]);
    		     temp2++;
    		     }
    		     String newPara="";
    		     for(int l = 1; l < paraList.size(); l++)
    		     {
    		    	 newPara +=  paraList.get(l)+" "; 
    		     }
    		     System.out.println(newPara);
    			 break outer;
    		 }
    		 else
    		 {
    			 value = false;
    		 }
    		 flag = true;
    	 }
    	 }
     }
     if(value == false)
     {
    	 System.out.println("Wrong Input please check the paragraph above");
     }
  }
}
