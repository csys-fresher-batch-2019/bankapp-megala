package com.customer;

import java.util.Scanner;

import customer.Customer;
import customer.CustomerDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestAddCustomer {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		Customer b1=new Customer();
		Scanner s1=new Scanner(System.in);
		LOGGER.getInput("Enter customerName:");
		b1.setName(s1.next());
		LOGGER.getInput("Enter customerStreet:");
		b1.setStreet(s1.next());
		LOGGER.getInput("Enter customerCity:");
		b1.setCity(s1.next());
		LOGGER.getInput("Enter Account type:");
		b1.setAccType(s1.next());
		LOGGER.getInput("Enter MobileNo:");
		b1.setMobileNo(s1.nextLong());
		LOGGER.getInput("Enter MailId:");
		b1.setEmail(s1.next());
		LOGGER.getInput("Enter Password:");
		b1.setPassword(s1.next());
		
		
//		Customer b2=new Customer();
//		LOGGER.getInput("Enter customerName:");
//		b2.setName(s1.next());
//		LOGGER.getInput("Enter customerStreet:");
//		b2.setStreet(s1.next());
//		LOGGER.getInput("Enter customerCity:");
//		b2.setCity(s1.next());
//		LOGGER.getInput("Enter Password:");
//		b2.setPassword(s1.next());
//		
//		Customer b3=new Customer();
//		LOGGER.getInput("Enter customerName:");
//		b3.setName(s1.next());
//		LOGGER.getInput("Enter customerStreet:");
//		b3.setStreet(s1.next());
//		LOGGER.getInput("Enter customerCity:");
//		b3.setCity(s1.next());
//		LOGGER.getInput("Enter Password:");
//		b3.setPassword(s1.next());
//		
//		Customer b4=new Customer();
//		LOGGER.getInput("Enter customerName:");
//		b4.setName(s1.next());
//		LOGGER.getInput("Enter customerStreet:");
//		b4.setStreet(s1.next());
//		LOGGER.getInput("Enter customerCity:");
//		b4.setCity(s1.next());
//		LOGGER.getInput("Enter Password:");
//		b4.setPassword(s1.next());
//		
		CustomerDAO dao=DAOFactory.getCustomerDAO();
		dao.addCustomer(b1);
//		dao.addCustomer(b2);
//		dao.addCustomer(b3);
//		dao.addCustomer(b4);
		s1.close();


	}

}
