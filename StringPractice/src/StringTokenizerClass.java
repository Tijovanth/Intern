import java.util.*;
public class StringTokenizerClass {

	public static void main(String[] args) {
		String s = "Tijo : vanth : Tijo : vanth ";
		StringTokenizer str = new StringTokenizer(s,":",true);
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}
	}
}
