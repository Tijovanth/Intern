
public class VariablesPractice {
     //private final int id;
	 private int id;
     private String name;
     private double marks;
     final static String college = "MCC";
     
//     VariablesPractice(int id)
//     {
//    	 this.id = id;
//     }
     public void Function()
     {
    	 //int a;
    	//private int a = 10;
    	 final int a = 10;
    	 System.out.println(a);
     }
//     public void anotherFunction()
//     {
//    	 System.out.println(a);
//     }
	public static void main(String[] args) {
		VariablesPractice object = new VariablesPractice();
//		System.out.println(object.id);
//		System.out.println(object.name);
//		System.out.println(object.marks);
		object.id = 1;object.name = "Tijo";object.marks=100.0d;
		System.out.println(object.id);
		System.out.println(object.name);
		System.out.println(object.marks);
		System.out.println(college);//complier automatically appends the class Name
	}

}
