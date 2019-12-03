
public class EncapsulationPractice {

	public static void main(String[] args) {
		Student object = new Student();
		object.setId(1);
		object.setName("Tijo");
		object.setCollege("MCC");
		System.out.println("Student Id :" + object.getId() + " Student Name: "+object.getName()+" Student college: "+object.getCollege());
	}

}
