import java.util.Scanner;
public class VishaliSum {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of Sentences");
       int rows = sc.nextInt();
       String[][] sentence = new String[rows][];
       int[][] num = new int[rows][];
       Scanner sc1 = new Scanner(System.in);
       for(int i = 0; i < rows; i++)
       {
    	   System.out.println("Enter the sentence");
    	   String str = sc1.nextLine();
    	   String arr[] = str.split(" ");
    	   sentence[i] = new String[arr.length];
    	   num[i] = new int[arr.length];
    	   for(int j = 0; j < sentence[i].length; j++)
    	   {
    		   sentence[i][j] = arr[j];
    		   
    	   }
       }
       int count = 1;int a = 0;
       for(int i = rows - 1; i < 0; i--)
		 {
			 for(int j = sentence[i].length-1; j < 0; j--)
			 { 
				     
					 if(sentence[i][a] == sentence[i][j])
						 count++;
			 }
			 num[i][a] = count;
			 count = 0;
		 }
       
	}

}
