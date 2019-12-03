
public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 40,  b= 20,  c = 30;
		
        int result = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println("result is:" + result);
	}

}
