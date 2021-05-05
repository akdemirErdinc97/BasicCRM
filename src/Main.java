import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.firstName = "Erdinç";
		customer1.lastName = "Akdemir";
		customer1.id=101;
		customer1.nationalityId="123456";
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		starbucksCustomerManager.Save(customer1);
	}

}
