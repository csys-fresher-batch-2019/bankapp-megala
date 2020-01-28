package com.creditcard;
import java.time.LocalDate;
import java.util.Scanner;

import creditcard.CreditCard;
import creditcard.CreditCardDAO;
import daoFactory.DAOFactory;
import logger.Logger;


public class TestAddCreditCard {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			CreditCard c1 = new CreditCard();
			Scanner s=new Scanner(System.in);
			LocalDate expiryDate = LocalDate.parse(s.next());
			LOGGER.getInput("Enter creditCardNo:");
			c1.setCreditCardNo(s.nextInt());
			LOGGER.getInput("Enter accNo:");
			c1.setAccNo(s.nextInt());
			LOGGER.getInput("Enter limitNo:");
			c1.setLimitNo(s.nextInt());
			LOGGER.getInput("Enter expiryDate:");
			c1.setExpiryDate(expiryDate);
			
			CreditCard c2 = new CreditCard();
			LocalDate expiryDate1 = LocalDate.parse(s.next());
			LOGGER.getInput("Enter creditCardNo:");
			c2.setCreditCardNo(s.nextInt());
			LOGGER.getInput("Enter accNo:");
			c2.setAccNo(s.nextInt());
			LOGGER.getInput("Enter limitNo:");
			c2.setLimitNo(s.nextInt());
			LOGGER.getInput("Enter expiryDate:");
			c2.setExpiryDate(expiryDate1);

			CreditCard c3 = new CreditCard();
			LocalDate expiryDate2 = LocalDate.parse(s.next());
			LOGGER.getInput("Enter creditCardNo:");
			c3.setCreditCardNo(s.nextInt());
			LOGGER.getInput("Enter accNo:");
			c3.setAccNo(s.nextInt());
			LOGGER.getInput("Enter limitNo:");
			c3.setLimitNo(s.nextInt());
			LOGGER.getInput("Enter expiryDate:");
			c3.setExpiryDate(expiryDate2);
			
			CreditCardDAO dao =DAOFactory.getCreditCardDAO();
			dao.addCreditCard(c1);
			dao.addCreditCard(c2);
			dao.addCreditCard(c3);
			s.close();

		}

	}

