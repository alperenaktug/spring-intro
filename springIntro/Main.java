package springIntro;

public class Main {
	    // IoC - Inversion of Control
		// Dependency Injection
		// spaghetti Code
		// SOLID

	public static void main(String[] args) {
		
		CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
		manager.add();
	

	}
	
	

}
