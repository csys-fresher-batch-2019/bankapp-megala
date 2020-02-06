package com.customer;

import java.util.Scanner;

import customer.CustomerDAO;
import daofactory.DAOFactory;
import logger.Logger;

public class TestUpdateCustomer {
	private static final Logger LOGGER=Logger.getInstance();
	
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerName");
		String name=s.next();
		LOGGER.getInput("Enter customerId:");
		int id=s.nextInt();
		CustomerDAO daoImpl = DAOFactory.getCustomerDAO();
		daoImpl.updateCustomer(name,id);
		s.close();
	}

}
