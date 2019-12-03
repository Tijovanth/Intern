
public class CustomGenericClass<T> {

	private T var;
	CustomGenericClass(T var)
	{
		this.var = var;
	}
	
	public void show()
	{
		System.out.println("The type of Object: "+ var.getClass().getName());
	}
	
	public T getVar()
	{
		return var;
	}
	public static void main(String[] args) {
		CustomGenericClass<String> ob = new CustomGenericClass<>("Tijo");
		ob.show();
		System.out.println(ob.getVar());
		CustomGenericClass<Integer> ob1 = new CustomGenericClass<>(1);
		ob1.show();
		System.out.println(ob1.getVar());
	}

}
