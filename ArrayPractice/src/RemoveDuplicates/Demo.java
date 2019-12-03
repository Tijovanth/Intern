package RemoveDuplicates;

public class Demo {

	public static void main(String[] args) {
      int[] arr= {1,4,2,3,3,6,4,5,2,1,8,9,0,5,6,7};
      int[] arr2 = new int[arr.length-1]; 
      int count = 0;
      for(int i = 0; i < arr.length; i++)
      {
    	  for(int j = i+1; j < arr.length; j++)
    	  {
    		  if(arr[i] == arr [j])
    		  {
                count++;
    		  }
    	  }
      }
      System.out.println(count);
      System.out.println(arr.length);
	} 
}