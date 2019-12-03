

interface MyInterface
{
	int a = 1 ;
	void show();
	int getVar();
	default void print()
	{
		System.out.println("Something");
	}
	static void mint()
	{
		System.out.println("Something mint");
	}
}

class MyClass implements MyInterface
{
	Integer var = 10;
	public void show()
	{
		System.out.println("The type of Object: "+ var.getClass().getName());
	}
	public int getVar()
	{
		return var;
	}
	public void print()
	{
		System.out.println("What Happend");
		MyInterface.super.print();
	}
}
public class BoundedGenericTypesForInterface<T extends MyClass2 & MyInterface> {
	T something;
	BoundedGenericTypesForInterface(T something)
	{
		this.something = something;
	}
	
	public void show()
	{
		something.show();
		System.out.println(something.getVar());
		System.out.println(MyInterface.a);
		something.print();
		MyInterface.mint();
	}

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		MyInterface ob2 = new MyClass();
		MyClass2 ob3 = new MyClass2();
		MyClass3 ob4 = new MyClass3();
		BoundedGenericTypesForInterface<MyClass2> object = new BoundedGenericTypesForInterface<>(ob3);
		BoundedGenericTypesForInterface<MyClass3> object1 = new BoundedGenericTypesForInterface<>(ob4);
		//BoundedGenericTypesForInterface<MyClass> object2 = new BoundedGenericTypesForInterface<>(ob);
		//BoundedGenericTypesForInterface<MyInterface> object3 = new BoundedGenericTypesForInterface<>(ob2);
		object.show();
		object1.show();
	}

}
