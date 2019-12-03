package inner;


class Popcorn
{
	int a = 10;
	public void taste()
	{
		System.out.println("Salty");
	}
	public void dis()
	{
		System.out.println("Popcorn dis");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		int a  = 10;
	    int b = 20;
        Popcorn p = new Popcorn()
        {
        	int a = 10;
        	static final int b = 20;
        	//static int c = 30; compile time error
//        	public static void ma()
//        	{
//        		complile time error
//        	}
        	public void taste()
        	{
        		System.out.println("spicy");
        		System.out.println(a);
        		System.out.println(b);
        	}
        };
        p.taste();
        p.dis();
        
        Popcorn p1 = new Popcorn();
        p1.taste();
        p1.dis();
        
        Popcorn p2 = new Popcorn()
        {
        	public void taste()
        	{
        		System.out.println("sweet");
        	}
        };
        p2.taste();
        p2.dis();
        System.out.println(p.getClass().getName());
        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());
	}
}
