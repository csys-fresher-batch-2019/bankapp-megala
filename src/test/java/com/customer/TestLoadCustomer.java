package com.customer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import customer.Customer;
import customer.CustomerDAOImpl;

public class TestLoadCustomer {

	public static void main(String[] args) throws Exception {
	String fileName="D:\\customer.txt";
		

		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		
		Path path=Paths.get(fileName);
		List<String> lines=Files.readAllLines(path);
		for(String line:lines) {
			System.out.println(line);
			
			String[] row=line.split(",");
			String name= row[0];
//			int id=Integer.parseInt(row[1]);  //type casting to int
			String street=row[1];
			String city=row[2];
			String pass=row[3];
			
			Customer customer=new Customer();
			customer.setName(name);
			customer.setStreet(street);
			customer.setCity(city);
			customer.setPassword(pass);
			System.out.println(customer);
			
			daoImpl.addCustomer(customer);

	}
		daoImpl.display();

}

	
}
