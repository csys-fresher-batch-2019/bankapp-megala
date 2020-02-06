package com.creditcard;

import java.util.Scanner;

import creditcard.CreditCardDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestDeleteCreditCard {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter accNo:");
		String accNo=s.next();
		CreditCardDAO dao = DAOFactory.getCreditCardDAO();
		try {
			dao.deleteCreditCard(accNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();

	}

}
