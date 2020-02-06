package com.customer;

import customer.CustomerDAO;
import daofactory.DAOFactory;

public class TestDisplayCustomer {

	public static void main(String[] args) throws Exception {
		CustomerDAO dao = DAOFactory.getCustomerDAO();
		dao.display();
	}

}
