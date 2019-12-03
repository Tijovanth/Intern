
public class Varags {
	
	
	//public static void printNumber(int ...name,int ...numbers)
	public static void printNumber(String name,boolean value,int ...numbers)
	{
		System.out.println(name);
		System.out.println(value);
		for(int x: numbers)
		{
			System.out.println(x);
		}
		System.out.println(numbers[0]);
	}
	public static void main(String[] args) {
		Varags.printNumber("tijo",false,2,3,4,5,9,0);
	}
}

//if we have two varargs in same method complier doesn't know where to start
