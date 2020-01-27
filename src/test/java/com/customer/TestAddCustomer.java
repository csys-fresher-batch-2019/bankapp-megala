package com.customer;

import customer.Customer;
import customer.CustomerDAOImpl;

public class TestAddCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer b1=new Customer();
		b1.id=1;
		b1.name="suba";
		b1.street="vellalore";
		b1.city="coimbatore";
		
		Customer b2=new Customer();
		b2.id=2;
		b2.name="jeeva";
		b2.street="varadharajapuram";
		b2.city="chennai";
		
		Customer b3=new Customer();
		b3.id=3;
		b3.name="devi";
		b3.street="ayanavaram";
		b3.city="chennai";
		
		Customer b4=new Customer();
		b4.id=4;
		b4.name="siva";
		b4.street="podanur";
		b4.city="coimbatore";
		
		CustomerDAOImpl daoImpl=new CustomerDAOImpl();
		daoImpl.addCustomer(b1);
		
		CustomerDAOImpl daoImpl2=new CustomerDAOImpl();
		daoImpl2.addCustomer(b2);
		
		CustomerDAOImpl daoImpl3=new CustomerDAOImpl();
		daoImpl3.addCustomer(b3);

		CustomerDAOImpl daoImpl4=new CustomerDAOImpl();
		daoImpl4.addCustomer(b4);


	}

}
