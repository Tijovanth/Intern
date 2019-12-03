import java.util.Locale;

public class StringMethods {

	public static void main(String[] args) {
		
         String s = "tijo";
         System.out.println(s.substring(0));
         System.out.println(s.substring(0,1));//it invokes the String(char value[],int offset, int count) constructor 
         
         System.out.println(s.charAt(0));// it may throw IndexOutOfRange
         
         String s2 = "Vanth";
         System.out.println(s.concat("null")); //Array.copy
         System.out.println(s+s2+567+2.0+false+null);//new StringBuilder().append().toString()
         
         String s3 = "Tijo", s4 = "tijo";
         System.out.println(s3.equals(s4));
         System.out.println(s3.equalsIgnoreCase(s4));
         
         String s5 = "AAiijooo0";
         System.out.println(s5.indexOf(48));
         System.out.println(s5.indexOf('i'));
         System.out.println(s5.indexOf(65,1));
         
         System.out.println(s5.lastIndexOf(65,0));
         
         System.out.println(s5.startsWith("A", 1));
         System.out.println(s5.endsWith("o"));
         Integer i = new Integer(1);
         System.out.println(i.hashCode());//s[0]*31^(length-1)+..s[n]*31^(length-n)
         
         System.out.println(s5.contains("AA"));
         
         String a = new String("Tijo");
         String b = new String("tijo");
         System.out.println(a.compareTo(b));// internally it checks the unicode value
         System.out.println(a.compareToIgnoreCase(b));
         
         System.out.println(s5.toUpperCase(new Locale("fr", "FRANCE", "WIN")));
         System.out.println(s5.toLowerCase(new Locale("fr","FRANCE","WIN")));
         
         String s6 = "Vanth";
         String s7 = s6.concat("Tijo");
         String s8 = s7.intern();
         String s9 = "VanthTijo";
         System.out.println(s8 == s7);
         System.out.println(s8 == s9);
         
         String s10 = "A1J1238JSjsj";
         System.out.println(s10.codePointAt(0));
         System.out.println(s10.codePointBefore(1));
         System.out.println(s10.codePointCount(0, 3));
         
         String s11 = "ABCD";
         System.out.println(s11.subSequence(0,2));
         
         System.out.println(s11.contains("Z"));
         
         String s12 = "Madras";
         String s13 = new String("Madras");
         System.out.println(s12.contentEquals(s13));
         
         char[] arr = new char[3];
         s12.getChars(0, 3, arr, 0);
         
         String str = "Tijo vanth"; 
        
         String gfg1 = String.format("My name is %s", str); 
         String str2 = String.format("My answer is %.8f", 47.65734); 
         String str3 = String.format("My answer is %015.8f", 47.65734); 
   
         System.out.println(gfg1); 
         System.out.println(str2); 
         System.out.println(str3);
         
         String s14 = "TIJOVANTH";
         System.out.println(s14.matches("[A-Z]*"));
         
         String s15 = "TIJO";
         System.out.println(s14.regionMatches(false, 0, s15, 0, s15.length()));
         
         System.out.println(s15.isEmpty());
         
         String str1 = "TijTTkTTjjjTTnjjTTj"; 
         String[] arrOfStr = str1.split("T", 0); 
         System.out.println(arrOfStr.length);
         for (String a1 : arrOfStr) 
             System.out.println(a1);
         
         String gfg = String.join(" < ", "Four", "Five", "Six", "Seven"); 
         gfg = String.join("->", arrOfStr);
         System.out.println(gfg);
         
         String s16 = "ABACD";
         System.out.println(s16.replace('A', 'B'));
         
         System.out.println(s16.replaceAll("A","Tijo"));
         
         System.out.println(s16.replaceFirst("A", "Tijo"));
         
	}

}
