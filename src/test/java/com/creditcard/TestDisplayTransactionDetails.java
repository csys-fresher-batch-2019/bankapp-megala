package com.creditcard;

import java.util.Scanner;

import creditcardtrans.CreditCardTransactionDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestDisplayTransactionDetails {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	LOGGER.getInput("Enter card Id:");
	long cardId=s.nextLong();
	CreditCardTransactionDAO dao = DAOFactory.getCreditCardTransactionDAO();
	try {
		dao.displayTransactionHistory(cardId);
	} catch (Exception e) {
		e.printStackTrace();
	}
	s.close();

	

	}

}
