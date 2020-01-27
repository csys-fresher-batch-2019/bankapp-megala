package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bank.ConnectionUtil;

public class CustomerDAOImpl implements CustomerDAO{
	public void addCustomer(Customer customer) throws Exception {
		String sql = "insert into customer_details(customer_name,customer_id,customer_street,customer_city)values(?,?,?,?)";
		System.out.println(sql);
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, customer.name);
			pst.setInt(2, customer.id);
			pst.setString(3, customer.street);
			pst.setString(4, customer.city);
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public List<Customer> display() throws Exception {
		List<Customer> c = new ArrayList<Customer>();

		String sql = "select customer_name,customer_id,customer_street,customer_city from customer_details";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);
		System.out.println("No of rows displyed:"+rows);

		while (rows.next()) {
			String name = rows.getString("customer_name");
			int id = rows.getInt("customer_id");
			String street=rows.getString("customer_street");
			String city = rows.getString("customer_city");
			System.out.println(name);
			System.out.println(id);
			System.out.println(street);
			System.out.println(city);
			
			//extracting details from sql
			Customer customer=new Customer();
			c.add(customer);
		}
		return c;
	}
	
	public void updateCustomer(String name, int id) throws Exception {
		String sql = "update Customer_details set customer_name=? where customer_id=?";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setInt(2, id);

		int rows = pst.executeUpdate();
		System.out.println("no of rows updated:"+rows);
	}
	public void deleteCustomer(int id) throws Exception {
		String sql = "delete from customer_details where customer_id=?";
		System.out.println(sql);
		
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1,id);

			int rows = pst.executeUpdate();
			System.out.println("no of rows deleted:" + rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}