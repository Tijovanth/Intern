
public class BoundedGenericTypes<T extends Number> {
         
	private T var;
	BoundedGenericTypes(T var)
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
		
		BoundedGenericTypes<Integer> ob = new BoundedGenericTypes<>(1);
		//BoundedGenericTypes<String> ob1 = new BoundedGenericTypes<>();
	    BoundedGenericTypes<Float> ob2 = new BoundedGenericTypes<>(1.0F);
	    BoundedGenericTypes<Double> ob3 = new BoundedGenericTypes<>(1.2);
	    ob.show();
	    System.out.println(ob.getVar()); 
	    ob2.show();
	    System.out.println(ob2.getVar());
	    ob3.show();
	    System.out.println(ob3.getVar());
	}

}
