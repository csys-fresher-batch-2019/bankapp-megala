package com.customer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import customer.Customer;
import customer.CustomerDAOImpl;

public class TestLoadCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	String fileName="D:\\customer.txt";
		

		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		
		Path path=Paths.get(fileName);
		List<String> lines=Files.readAllLines(path);
		for(String line:lines) {
			System.out.println(line);
			
			String[] row=line.split(",");
			String name= row[0];
			int id=Integer.parseInt(row[1]);  //type casting to int
			String street=row[2];
			String city=row[3];
			
			Customer customer=new Customer();
			customer.name=name;
			customer.id=id;
			customer.street=street;
			customer.city=city;
			System.out.println(customer);
			
			daoImpl.addCustomer(customer);

	}
		daoImpl.display();

}

	
}
