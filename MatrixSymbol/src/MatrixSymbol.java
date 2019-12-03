import java.util.*;
public class MatrixSymbol {
	void MatrixSymbolMethod(int rows, int columns, Scanner sc)
	{
		 String matrixsymbol[][] = new String[rows][];
		 for(int i = 0; i < rows; i++)
		 {
			 matrixsymbol[i] = new String[columns];
		 }
		 System.out.println("Enter the Number or Character");
		 for(int i = 0; i < matrixsymbol.length; i++)
		 {
			 for(int j = 0; j < matrixsymbol[i].length; j++)
			 {
                 String temp = sc.next();
                 try
                 {
                    Integer.parseInt(temp);
                	matrixsymbol[i][j] = "*";
                 } catch(NumberFormatException e)
                 {
                	 matrixsymbol[i][j] = "#";
                 }
			 }
			 System.out.println();
		 }
		 for(int i = 0; i < matrixsymbol.length; i++)
		 {
			 for(int j = 0; j < matrixsymbol[i].length; j++)
			 {
				 System.out.print(matrixsymbol[i][j]+"\t");
			 }
			 System.out.println();
		 }
	}
	public static void main(String[] args) {
      boolean value = true;
      while(value)
      {
    	  try
    	  {
    		  Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Rows You want");
        int rows = sc.nextInt();
        System.out.println("Enter How many Columns You want");
        int columns = sc.nextInt();
        MatrixSymbol object = new MatrixSymbol();
        object.MatrixSymbolMethod(rows, columns, sc);
        value = false;
        sc.close();
    	  }catch (InputMismatchException e)
    	  {
    		  System.out.println("You were Entered Wrong input");
    	  }
      }
	}
}
