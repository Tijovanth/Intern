
public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
		s.ensureCapacity(18);
		System.out.println(s.capacity());
		System.out.println(s);
		StringBuffer s1 = new StringBuffer(102);
		System.out.println(s1.capacity());
		s1.ensureCapacity(306);
		System.out.println(s1.capacity());
		s.append("ti121");
		s.append("Vanth");
		System.out.println(s);
		System.out.println(s.reverse());
		//System.out.println(s);
		System.out.println(s.codePointAt(2));
		System.out.println(s.codePointBefore(3));
		System.out.println(s.codePointCount(2, 8));
		char[] destarr = new char[10];
		s.getChars(0, 3, destarr, 0); 
//		for(char r : destarr)
//		{
//			System.out.println(r);
//		}
		StringBuffer str = new StringBuffer("Tijo");
		System.out.println(str.capacity());
		str.trimToSize();
		System.out.println(str.capacity());
		str.replace(1,2,"vanth");
		System.out.println(str);
		str.delete(0,1);
		System.out.println(str);
		str.deleteCharAt(0);
		System.out.println(str);
		System.out.println(str.hashCode());
	}

}
