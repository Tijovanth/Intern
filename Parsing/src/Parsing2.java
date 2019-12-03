
public class Parsing2 {

	public static void main(String[] args) {
		//Integer decimalExample = Integer.parseInt(20); this will cause an error
		//Integer decimalExample = Integer.parseInt('A'); this will cause an error
		Integer decimalExample = Integer.parseInt("20");
        int signedPositiveExample = Integer.parseInt("+20"); 
        int signedNegativeExample = Integer.parseInt("-20"); 
        int radixExample = Integer.parseInt("20", 16); 
   
  
        System.out.println(decimalExample); 
        System.out.println(signedPositiveExample); 
        System.out.println(signedNegativeExample); 
        System.out.println(radixExample); 
        
        Integer decimal = Integer.valueOf(20); //this will not cause an error
        int signedPositive = Integer.valueOf('A'); // this will not cause an error
        int signedNegative = Integer.valueOf("-20"); 
        int radix = Integer.valueOf("20", 16); 
        
        System.out.println(decimal); 
        System.out.println(signedPositive); 
        System.out.println(signedNegative); 
        System.out.println(radix); 
	}

}
