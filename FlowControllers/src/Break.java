
public class Break {

	public static void main(String[] args) {
	   
      for(int i = 0; i < 10; i++)
      {
    	  System.out.println(i);
    	  if(i == 5)
    	  {
    		  break;
    	  }
      }
      
      System.out.println("label");
      boolean value = true;
      first: 
      { 
          second: 
      { 
          third: 
          { 
              System.out.println("Before the break statement"); 
              if (value) 
                  break second; 
              System.out.println("This won't execute."); 
          } 
          System.out.println("This won't execute."); 
      } 

      System.out.println("This is after second block."); 
  }
	}

}
