package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import logger.Logger;

public class CustomerDAOImpl implements CustomerDAO{
	private static final Logger LOGGER = Logger.getInstance();

	public void addCustomer(Customer customer) {
		String sql = "insert into customer_details(customer_name,customer_id,customer_street,customer_city)values(?,?,?,?)";
		LOGGER.info(sql);
		try (
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setString(1, customer.getName());
			pst.setInt(2, customer.getId());
			pst.setString(3, customer.getStreet());
			pst.setString(4, customer.getCity());
			int rows = pst.executeUpdate();
			LOGGER.info("no of rows inserted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}
}
	
	public List<Customer> display()  {
		List<Customer> c = new ArrayList<>();

		String sql = "select customer_name,customer_id,customer_street,customer_city from customer_details";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement()){
		try(ResultSet rows = stmt.executeQuery(sql)){
			LOGGER.info("No of rows displyed:"+rows);

		while (rows.next()) {
			String name = rows.getString("customer_name");
			int id = rows.getInt("customer_id");
			String street=rows.getString("customer_street");
			String city = rows.getString("customer_city");
			LOGGER.debug(name);
			LOGGER.debug(id);
			LOGGER.debug(street);
			LOGGER.debug(city);
			Customer customer=new Customer();
			c.add(customer);
		}
		}
		}catch (Exception e) {
		
			LOGGER.error(e);
		}
		return c;
	}
	
	public void updateCustomer(String name, int id)  {
		String sql = "update Customer_details set customer_name=? where customer_id=?";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setString(1, name);
		pst.setInt(2, id);

		int rows = pst.executeUpdate();
		LOGGER.info("no of rows updated:"+rows);
	}catch (Exception e) {
		
		LOGGER.error(e);
	}
	}
		
	public void deleteCustomer(int id) {
		String sql = "delete from customer_details where customer_id=?";
		LOGGER.info(sql);
		
		try (
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setInt(1,id);

			int rows = pst.executeUpdate();
			LOGGER.info("no of rows deleted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}

	}
}