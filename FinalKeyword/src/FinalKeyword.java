
public class FinalKeyword {
        final int SPEED;   //it should be initialized at the time of declaration or we should provide constructor
        
        FinalKeyword(int speed)
        {
        	SPEED = speed;
        }
        
       final void display() 
        {
        	//SPEED = 10; we cannot change final variable once its has initialized
        	System.out.println(SPEED);
        }
	public static void main(String[] args) {
		
       FinalKeyword object = new FinalKeyword(25);
       object.display();
       MyOtherClass object2 = new MyOtherClass();
       object2.dis();
	}

}
