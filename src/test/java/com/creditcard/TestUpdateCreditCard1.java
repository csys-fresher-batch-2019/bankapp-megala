package com.creditcard;

import java.util.Scanner;

import creditcard.CreditCardDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestUpdateCreditCard1 {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
	
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter comments:");
		String comments=s.next();
		LOGGER.getInput("Enter creditCardNo:");
		int creditNo=s.nextInt();
		LOGGER.getInput("Enter blocked status:");
		boolean status=s.nextBoolean();
		CreditCardDAO dao = DAOFactory.getCreditCardDAO();
		try {
			dao.updateCreditCard1(comments,creditNo,status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();

	}

}
