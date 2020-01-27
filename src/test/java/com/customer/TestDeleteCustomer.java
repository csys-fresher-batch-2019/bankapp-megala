package com.customer;

import customer.CustomerDAOImpl;

public class TestDeleteCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		daoImpl.deleteCustomer(4);
	}

}
