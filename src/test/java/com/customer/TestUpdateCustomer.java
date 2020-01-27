package com.customer;

import customer.CustomerDAOImpl;

public class TestUpdateCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		daoImpl.updateCustomer("arun",1);
	}

}
