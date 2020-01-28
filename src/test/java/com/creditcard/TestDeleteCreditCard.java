package com.creditcard;

import java.util.Scanner;

import creditcard.CreditCardDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestDeleteCreditCard {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter accNo:");
		String accNo=s.next();
		CreditCardDAO dao = DAOFactory.getCreditCardDAO();
		dao.deleteCreditCard(accNo);
		s.close();

	}

}
