package com.creditcard;
import java.time.LocalDate;
import java.util.Scanner;

import creditcard.CreditCard;
import creditcard.CreditCardDAO;
import daofactory.DAOFactory;
import logger.Logger;


public class TestAddCreditCard {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args){
		// TODO Auto-generated method stub

			CreditCard c1 = new CreditCard();
			Scanner s=new Scanner(System.in);
			LOGGER.getInput("Enter creditCardNo:");
			c1.setCardNo(s.nextLong());
			LOGGER.getInput("Enter creditCardPin:");
			c1.setPin(s.nextInt());
			LOGGER.getInput("Enter accNo:");
			c1.setAccNo(s.nextInt());
			LOGGER.getInput("Enter limitNo:");
			c1.setLimitNo(s.nextInt());
			LOGGER.getInput("Enter cvvNo:");
			c1.setCvvNo(s.nextInt());
			LOGGER.getInput("Enter expiryDate:");
			LocalDate expiryDate = LocalDate.parse(s.next());
			c1.setExpiryDate(expiryDate);
			LOGGER.getInput("Enter availableBalance:");
			c1.setAvailableBalance(s.nextInt());
			
			CreditCard c2 = new CreditCard();
			LOGGER.getInput("Enter creditCardNo:");
			c2.setCardNo(s.nextLong());
			LOGGER.getInput("Enter creditCardPin:");
			c2.setPin(s.nextInt());
			LOGGER.getInput("Enter accNo:");
			c2.setAccNo(s.nextInt());
			LOGGER.getInput("Enter limitNo:");
			c2.setLimitNo(s.nextInt());
			LOGGER.getInput("Enter cvvNo:");
			c2.setCvvNo(s.nextInt());
			LOGGER.getInput("Enter expiryDate:");
			LocalDate expiryDate1 = LocalDate.parse(s.next());
			c2.setExpiryDate(expiryDate1);
			LOGGER.getInput("Enter availableBalance:");
			c2.setAvailableBalance(s.nextInt());
			
			CreditCard c3 = new CreditCard();
			LOGGER.getInput("Enter creditCardNo:");
			c3.setCardNo(s.nextLong());
			LOGGER.getInput("Enter creditCardPin:");
			c3.setPin(s.nextInt());
			LOGGER.getInput("Enter accNo:");
			c3.setAccNo(s.nextInt());
			LOGGER.getInput("Enter limitNo:");
			c3.setLimitNo(s.nextInt());
			LOGGER.getInput("Enter cvvNo:");
			c3.setCvvNo(s.nextInt());
			LOGGER.getInput("Enter expiryDate:");
			LocalDate expiryDate2 = LocalDate.parse(s.next());
			c3.setExpiryDate(expiryDate2);
			LOGGER.getInput("Enter availableBalance:");
			c3.setAvailableBalance(s.nextInt());
			
			
			
			
			
			CreditCardDAO dao =DAOFactory.getCreditCardDAO();
			try {
				dao.addCreditCard(c1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				dao.addCreditCard(c2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				dao.addCreditCard(c3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.close();

		}

	}



