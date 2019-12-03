import java.util.*;
 class UserCreditCard {
     
	 private String username;
	 private int pin;
	 private long phonenumber;
	 private String emailid;
	 private long balance;
	 private long creditcardnumber;
	 private LinkedList<String> products = new LinkedList<String>();
	 public UserCreditCard(String username,String emailid,long phonenumber,int pin,long balance,long creditcardnumber)
	 {
		 this.username = username;
		 this.emailid = emailid;
		 this.phonenumber = phonenumber;
		 this.pin = pin;
		 this.balance = balance;
		 this.creditcardnumber = creditcardnumber;
	 }
	 public void setUsername(String username)
	 {
		 this.username = username;
	 }
	 public void setPinNumber(int pin)
	 {
		 this.pin = pin;
	 }
	 public void setPhoneNumber(long phonenumber)
	 {
		 this.phonenumber = phonenumber;
	 }
	 public void setemailId(String email)
	 {
		 emailid = email;
	 }
	 public void setBalance(long balance)
	 {
		 this.balance = balance;
	 }
	 public void addBalance(long balance)
	 {
		 this.balance += balance;
	 }
	 public void minusBalance(long balance)
	 {
		 this.balance -= balance;
	 }
	 public String getUsername()
	 {
		 return username;
	 }
	 public int getPinNumber()
	 {
		 return pin;
	 }
	 public long getPhoneNumber()
	 {
		 return phonenumber;
	 }
	 public String getEmailId()
	 {
		 return emailid;
	 }
	 public long getBalance()
	 {
		 return balance;
	 }
	 public long getCreditCardNumber()
	 {
		 return creditcardnumber;
	 }
	 public void setProducts(String product)
	 {
		 products.add(product);
	 }
	 public LinkedList getProducts()
	 {
		 return products;
	 }
}
