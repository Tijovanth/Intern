import java.util.*;
public class Reverse_A_String {
	
	public static String reverseString(String input)
    {
        int inputlength = input.length();
    String reversedstring = "";
    for(int i = inputlength - 1; i >= 0 ; i--)
    {
        reversedstring += input.charAt(i);
    }
    return reversedstring;
   // s.close();
}

//public static void reverseStringArray(String input)
//{
//    String[] alphabets = input.split("");
//    Collections.reverse(Arrays.asList(alphabets));
//    input = String.join("", alphabets);
//    System.out.println(input);
//   // sc.close();
//}

public static void stringSort(String input)
{
	TreeSet<String> someletters = new TreeSet<String>(new MyComparator());
	input = input.toLowerCase();
	for(int i = 0; i < input.length(); i++)
	{
		someletters.add(String.valueOf(input.charAt(i)));
	}
	input = "";
	for(String x : someletters )
	{
		input += x;
	}
	System.out.println("Sorted String: " + input);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Alphabets ");
//	    String input = sc.next();
//		Reverse_A_String.reverseStringArray(input);
		System.out.println("Enter Alphabets");
		String input = sc.next();
	    input = Reverse_A_String.reverseString(input);
	    System.out.println("The Reverse String :" +input);
	    Reverse_A_String.stringSort(input);
		sc.close();
	}
}

