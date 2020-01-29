package com.customer;

import java.util.Scanner;

import customer.Customer;
import customer.CustomerDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestAddCustomer {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer b1=new Customer();
		Scanner s1=new Scanner(System.in);
		LOGGER.getInput("Enter customerId:");
		b1.id=s1.nextInt();
		LOGGER.getInput("Enter customerName:");
		b1.name=s1.next();
		LOGGER.getInput("Enter customerStreet:");
		b1.street=s1.next();
		LOGGER.getInput("Enter customerCity:");
		b1.city=s1.next();
		
		Customer b2=new Customer();
		System.out.println("Enter customerId:");
		LOGGER.getInput("Enter customerId:");
		b2.id=s1.nextInt();
		LOGGER.getInput("Enter customerName:");
		b2.name=s1.next();
		LOGGER.getInput("Enter customerStreet:");
		b2.street=s1.next();
		LOGGER.getInput("Enter customerCity:");
		b2.city=s1.next();
		
		Customer b3=new Customer();
		LOGGER.getInput("Enter customerId:");
		b3.id=s1.nextInt();
		LOGGER.getInput("Enter customerName:");
		b3.name=s1.next();
		LOGGER.getInput("Enter customerStreet:");
		b3.street=s1.next();
		LOGGER.getInput("Enter customerCity:");
		b3.city=s1.next();
		
		Customer b4=new Customer();
		LOGGER.getInput("Enter customerId:");
		b4.id=s1.nextInt();
		LOGGER.getInput("Enter customerName:");
		b4.name=s1.next();
		LOGGER.getInput("Enter customerStreet:");
		b4.street=s1.next();
		LOGGER.getInput("Enter customerCity:");
		b4.city=s1.next();
		
		CustomerDAO dao=DAOFactory.getCustomerDAO();
		dao.addCustomer(b1);
		dao.addCustomer(b2);
		dao.addCustomer(b3);
		dao.addCustomer(b4);
		s1.close();


	}

}
