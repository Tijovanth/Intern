package inner;
 interface MyInterface
 {
	 public void show();
 }
public class AnonymousInsideArgs {
	
	AnonymousInsideArgs(MyInterface o)
	{
		System.out.println("Constructor");
		o.show();
	}
    public void dis()
    {
    	System.out.println("dis");
    }
	public static void main(String[] args) {
        
		new AnonymousInsideArgs(new MyInterface()
		{
			public void show()
			{
				System.out.println("This is a show Method");
			}
		}).dis();
	}

}
