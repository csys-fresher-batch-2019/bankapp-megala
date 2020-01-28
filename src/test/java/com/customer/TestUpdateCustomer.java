package com.customer;

import java.util.Scanner;

import customer.CustomerDAOImpl;

public class TestUpdateCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter customerName");
		String name=s.next();
		System.out.println("Enter customerId:");
		int id=s.nextInt();
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		daoImpl.updateCustomer(name,id);
		s.close();
	}

}
