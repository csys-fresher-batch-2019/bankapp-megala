package com.account;

import logger.Logger;

import java.util.Scanner;

import account.Account;
import account.AccountDAO;
import factory.DAOFactory;

public class TestAddAccount {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args) {
		
		
		Account b1=new Account();
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerId:");
		b1.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter accNo:");
		b1.setAccNo(s.nextLong());
		LOGGER.getInput("Enter accType:");
		b1.setAccType(s.next());
		LOGGER.getInput("Enter availableBalance:");
		b1.setAvailableBalance(s.nextInt());
		
		Account b2=new Account();
		LOGGER.getInput("Enter customerId:");
		b2.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter accNo:");
		b2.setAccNo(s.nextLong());
		LOGGER.getInput("Enter accType:");
		b2.setAccType(s.next());
		LOGGER.getInput("availableBalance:");
		b2.setAvailableBalance(s.nextInt());
		
		Account b3=new Account();
		LOGGER.getInput("Enter customerId:");
		b3.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter accNo:");
		b3.setAccNo(s.nextLong());
		LOGGER.getInput("Enter accType:");
		b3.setAccType(s.next());
		LOGGER.getInput("availableBalance:");
		b3.setAvailableBalance(s.nextInt());
		
		AccountDAO dao=DAOFactory.getAccountDAO();
		try {
			dao.addAccount(b1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			dao.addAccount(b2);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			dao.addAccount(b3);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		s.close();
	}

}
