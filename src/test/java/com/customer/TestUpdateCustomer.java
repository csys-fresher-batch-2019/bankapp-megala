package com.customer;

import java.util.Scanner;

import customer.CustomerDAOImpl;
import logger.Logger;

public class TestUpdateCustomer {
	private static final Logger LOGGER=Logger.getInstance();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerName");
		String name=s.next();
		LOGGER.getInput("Enter customerId:");
		int id=s.nextInt();
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		daoImpl.updateCustomer(name,id);
		s.close();
	}

}
