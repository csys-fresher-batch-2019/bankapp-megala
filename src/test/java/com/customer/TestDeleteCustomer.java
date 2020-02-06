package com.customer;

import java.util.Scanner;

import customer.CustomerDAO;
import daofactory.DAOFactory;
import logger.Logger;

public class TestDeleteCustomer {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerId:");
		int input=s.nextInt();
		CustomerDAO dao =DAOFactory.getCustomerDAO();
		dao.deleteCustomer(input);
		s.close();
	}

}
