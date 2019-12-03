
public class ArrayPractice {
   int id;
   ArrayPractice(int id)
   {
	   this.id = id;
   }
   
   static ArrayPractice[] method(ArrayPractice[] arr)
   {
	   return arr;
   }
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++)
		{
			arr[i] = i;
		}
		for(int x : arr)
		{
			System.out.println(x);
		}
        long[] arr1 = {1l,2l,3l,4l,5l};
        System.out.println(arr1[0]);
        //System.out.println(arr[10]); this will cause an error
        ArrayPractice[] arp = new ArrayPractice[10];
        arp[0]  = new ArrayPractice(1009);
        System.out.println(arp[0].id);
        
        int[][] arr2 = {{1,2},{2,3},{3,4}};
        for(int i = 0; i < arr2.length; i++)
        {
        	for(int j = 0; j < 2; j++)
        	{
        		System.out.println(arr2[i][j]);
        	}
        }
        System.out.println(method(arp));
        int[][] clonearr = arr2.clone();
        System.out.println(clonearr == arr2);
        System.out.println(clonearr[0] == arr2[0]);
        
        int arr3[][] = new int[2][]; 
        arr3[0] = new int[3];
        arr3[1] = new int[2]; 
        int count = 0; 
        for (int i=0; i<arr3.length; i++) 
            for(int j=0; j<arr3[i].length; j++) 
                arr3[i][j] = count++;
        for (int i=0; i<arr3.length; i++) 
        { 
            for (int j=0; j<arr3[i].length; j++) 
                System.out.print(arr3[i][j] + " "); 
            System.out.println(); 
        } 
	}
	     

}
