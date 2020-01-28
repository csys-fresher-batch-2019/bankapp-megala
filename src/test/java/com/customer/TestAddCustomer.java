package com.customer;

import java.util.Scanner;

import customer.Customer;
import customer.CustomerDAOImpl;

public class TestAddCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer b1=new Customer();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter customerId:");
		b1.id=s1.nextInt();
		System.out.println("Enter customerName:");
		b1.name=s1.next();
		System.out.println("Enter customerStreet:");
		b1.street=s1.next();
		System.out.println("Enter customerCity:");
		b1.city=s1.next();
		
		Customer b2=new Customer();
		System.out.println("Enter customerId:");
		b2.id=s1.nextInt();
		System.out.println("Enter customerName:");
		b2.name=s1.next();
		System.out.println("Enter customerStreet:");
		b2.street=s1.next();
		System.out.println("Enter customerCity:");
		b2.city=s1.next();
		
		Customer b3=new Customer();
		System.out.println("Enter customerId:");
		b3.id=s1.nextInt();
		System.out.println("Enter customerName:");
		b3.name=s1.next();
		System.out.println("Enter customerStreet:");
		b3.street=s1.next();
		System.out.println("Enter customerCity:");
		b3.city=s1.next();
		
		Customer b4=new Customer();
		System.out.println("Enter customerId:");
		b4.id=s1.nextInt();
		System.out.println("Enter customerName:");
		b4.name=s1.next();
		System.out.println("Enter customerStreet:");
		b4.street=s1.next();
		System.out.println("Enter customerCity:");
		b4.city=s1.next();
		
		CustomerDAOImpl daoImpl=new CustomerDAOImpl();
		daoImpl.addCustomer(b1);
		
		CustomerDAOImpl daoImpl2=new CustomerDAOImpl();
		daoImpl2.addCustomer(b2);
		
		CustomerDAOImpl daoImpl3=new CustomerDAOImpl();
		daoImpl3.addCustomer(b3);

		CustomerDAOImpl daoImpl4=new CustomerDAOImpl();
		daoImpl4.addCustomer(b4);
		
		s1.close();


	}

}
