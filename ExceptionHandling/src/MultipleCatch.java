
public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a=2/0;
			}
			catch(ArithmeticException e) {
			System.out.println("handled in first match");
			System.out.println(e.getMessage());
			}
			catch(Exception ex) {
			System.out.println("handled in the parentclass");
			System.out.println(ex.getMessage());
			}

	}

}
