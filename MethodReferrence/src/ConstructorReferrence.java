interface Interface
{
	void message(String msg);
}
public class ConstructorReferrence {

	ConstructorReferrence(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
       
		Interface message = ConstructorReferrence :: new;
		message.message("Hai Iam Tijo");
	}
}
