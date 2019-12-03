
public class AnonymousArray {
	
	public void dis(int[] arr)
	{
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		AnonymousArray ob = new AnonymousArray();
		ob.dis(new int[] {1,2,3,4,5});
	}
}
