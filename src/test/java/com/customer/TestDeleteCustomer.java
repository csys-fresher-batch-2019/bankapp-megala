package com.customer;

import java.util.Scanner;

import customer.CustomerDAOImpl;

public class TestDeleteCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter customerId:");
		int input=s.nextInt();
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		daoImpl.deleteCustomer(input);
		s.close();
	}

}
