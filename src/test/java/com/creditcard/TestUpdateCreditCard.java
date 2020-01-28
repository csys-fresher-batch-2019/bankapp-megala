package com.creditcard;

import java.util.Scanner;

import creditcard.CreditCardDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestUpdateCreditCard {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter status:");
		int id=s.nextInt();
		LOGGER.getInput("Enter accNo:");
		String accNo=s.nextLine();
		CreditCardDAO c1 = DAOFactory.getCreditCardDAO();
		c1.updateCreditCard(id,accNo);
		s.close();

	}

}
