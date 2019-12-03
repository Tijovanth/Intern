
public class MethodOverloading {
	
	public void dis(int a, long b)
	{
		System.out.println("2 int paras");
	}
//	public void dis(long a, long b)
//	{
//		System.out.println("2 long paras");
//	}
    public void dis(int a)
    {
    	System.out.println("1 int paras");
    }
    public void dis(double a)
    {
    	System.out.println("1 double paras");
    }
    public void dis()
    {
    	System.out.println("no paras");
    }
    public void dis(byte a)
    {
    	System.out.println("byte paras");
    }
    public void dis(Integer i)
    {
    	System.out.println(i);
    }
    public void dis(String i)
    {
    	System.out.println(i);
    }
    public void dis(Object o, int i)
    {
    	System.out.println("Object");
    }
    public void disp(Integer i)
    {
    	System.out.println(i);
    }
    public void disp()
    {
    	System.out.println();
    }
	public static void main(String[] args) {
      MethodOverloading ob = new MethodOverloading();
      ob.dis((byte)1);
     ob.dis(1.0f);
     // ob.dis(1l,2l);
      System.out.println(main());
      Integer i = 0;
      //ob.dis(null); this will cause an error
      ob.dis(i);
      long l = 10l;
      ob.dis(l, 1);
      byte b = 5;
     // ob.disp(b); this will cause an error
	}
	public static int main()
	{
		return 1;
	}
}
