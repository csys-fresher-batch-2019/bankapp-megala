package customer;

import java.util.List;

public interface CustomerDAO {
	public void addCustomer(Customer customer) throws Exception;
	public List<Customer> display() throws Exception;
	public void deleteCustomer(int id) throws Exception;



}
