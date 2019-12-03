
public class StringClass {

	public static void main(String[] args) {
		
     String s1 = "Tijo";
     String s4 = "Tijo";
     String s2 = new String("Tijo");
//     System.out.println(s1);
//     System.out.println(s2 == s1);
     String s3 = new String("Tijo");
//     System.out.println(s3 == s2);
     System.out.println(s4 == s1);
     System.out.println(s3 == s4);
     System.out.println(s4.equals(s1));
     System.out.println(s4.compareTo(s1));
     s4 += "Vanth";
     System.out.println(s4);
     s1 = s1.concat(s2);
     System.out.println(s1);
    // String s5 = s1.substring(19,36); Index Out of range error
      System.out.println(s1.toLowerCase());
      System.out.println(s1.toUpperCase());
      String s6 = "    Tijo      ";
      System.out.println(s6.trim());
      System.out.println(s6);
      System.out.println(s6.length());
      System.out.println(s6.startsWith("T"));
      System.out.println(s6.endsWith(" "));
      String s7 = s6.intern();
      System.out.println(s7 == s6);
      System.out.println(s7.hashCode() + " " + s6.hashCode());
	}

}
