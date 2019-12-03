
public class PrimitiveDataTypes {
	int a; 
    byte b;
    char c;
    double d;
    float f;
    boolean bool;
    short s;
    long l;
	public static void main(String[] args) {
		PrimitiveDataTypes ob = new PrimitiveDataTypes();
//		System.out.println(ob.a); 0
//		System.out.println(ob.b); 0
//		System.out.println(ob.c); \u0000
//		System.out.println(ob.d); 0.0
//		System.out.println(ob.f); 0.0
//		System.out.println(ob.bool); false
//		System.out.println(ob.s); 0
//		System.out.println(ob.l); 0
		ob.b = 'A';
		System.out.println(ob.b);
		ob.c = 65;
		System.out.println(ob.c);
		ob.b = (byte) 256;
		System.out.println(ob.b);
		ob.b++;
		System.out.println(ob.b);
	}
}
