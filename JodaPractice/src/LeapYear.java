import java.time.Year;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2020;
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
