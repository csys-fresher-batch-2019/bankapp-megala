package com.customer;

import java.util.List;

import customer.Customer;
import customer.CustomerDAOImpl;

public class TestExportCustomer {

	public static void main(String[] args) throws Exception {

		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		List<Customer> display = daoImpl.display();
		
		System.out.println("NO of customers:" + display.size());
		String fileContent = " ";
		//Path path=Paths.get(fileName);
		//List<String> lines=Files.readAllLines(path);
		for(Customer customer:display) {
			String line = customer.getId()+","+customer.getName()+","+customer.getStreet()+","+customer.getCity()+","+customer.getPassword();
			
			fileContent = fileContent+line+"\n";
			
	}
	}

}
