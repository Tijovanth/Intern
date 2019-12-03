
public class Forloop {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++)
		{
			System.out.println(i);
		}
		System.out.println();
        int[][] arr = {{1,2},{3,4},{5,6}};
        
        for(int i = 0; i < arr.length; i++)
        {
        	for(int j = 0; j < arr[i].length; j++)
        	{
        		System.out.println(arr[i][j]);
        	}
        }
        System.out.println();
        int[] ar = {1,2,3,5};
        for(int x: ar)
        {
        	System.out.println(x);
        }
        System.out.println();
        label:
        	for(int i = 0; i < 3; i++)
        	{
        		label1:
        			for(int j = 0; j < 3; j++ )
        			{
        				System.out.print(i+"  "+j);
        				break label;
        			}
                  System.out.println();
        	}

}}
