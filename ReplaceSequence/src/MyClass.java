import java.util.ArrayList;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
	    ArrayList<String> paragraph = new ArrayList<>();
	    String test;
	    String para = "";
	    while(sc.hasNextLine()){           
	    	   test = sc.nextLine();
	    	  if(test.equals("exit"))
	    	  {
	    		 break;
	    	  }
	    	   para += test + " ";
		}
	      String[] paraArr = para.split(" ");
	      for(String x: paraArr)
		    {
		    	paragraph.add(x);
		    }
	    System.out.println("Enter the Sequence you want to remove");
	    ArrayList<String> remove = new ArrayList<>();
	    String removeVar = sc.nextLine();
	    String[] removeArray = removeVar.split(" ");
	    for(String x: removeArray)
	    {
	    	remove.add(x);
	    }
	    System.out.println(remove);
	    System.out.println(paragraph);
	    int value = 0;
	    	
	    		int index = 0;
	    		for(int i = 0; i < paragraph.size(); i++)
	    		{
	    			
	    			if(paragraph.get(i).equals(remove.get(0)))
	    			{
	    				value = 1;
	    				if((paragraph.size() - i) >= remove.size())
	    				{	
	    				
	    				int temp = i;
	    				boolean flag = true;
	    				for(int j = 0; j < remove.size(); j++)
	    				{
	    					
	    					if(!paragraph.get(temp).equals(remove.get(j)))
	    					{
	    						
	    						flag = false;
	    						break;
	    					}
	    					temp++;
	    				}
	    				if(flag == true)
	    				{
	    					
	    					index = i;
	    					paragraph.removeAll(remove);
	    		    		System.out.println("Enter the sequence you want to replace");
	    		    		String replaceVar = sc.nextLine();
	    		    		paragraph.add(index, replaceVar);
	    		    		String result = "";
	    		    		for(int k = 0; k < paragraph.size(); k++)
	    		    		{
	    		    			result += paragraph.get(k) + " ";
	    		    		}
	    		    		System.out.println(result);
	    					break;
	    				}
	    				else
	    	    		 {
	    	    			 value = 2;
	    	    		 }
	                  flag = true;
	    			}
	    		}
	    		}
	    		if(value == 2 || value == 0)
	    		{
	    			System.out.println("Please check ");
	    		}
	    		
	}
}
