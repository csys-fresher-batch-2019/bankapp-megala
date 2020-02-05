package com.account;

import daoFactory.DAOFactory;
import logger.Logger;

import java.util.Scanner;

import account.Account;
import account.AccountDAO;

public class TestAddAccount {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account b1=new Account();
//		b1.customerId=3;
//		b1.accNo=11188;
//		b1.accType="saving";
//		b1.availableBalance=12340;
		
		Account b1=new Account();
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerId:");
		b1.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter accNo:");
		b1.setAccNo(s.nextInt());
		LOGGER.getInput("Enter accType:");
		b1.setAccType(s.next());
		LOGGER.getInput("Enter availableBalance:");
		b1.setAvailableBalance(s.nextInt());
		
		Account b2=new Account();
		LOGGER.getInput("Enter customerId:");
		b2.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter accNo:");
		b2.setAccNo(s.nextInt());
		LOGGER.getInput("Enter accType:");
		b2.setAccType(s.next());
		LOGGER.getInput("availableBalance:");
		b2.setAvailableBalance(s.nextInt());
		
		Account b3=new Account();
		LOGGER.getInput("Enter customerId:");
		b3.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter accNo:");
		b3.setAccNo(s.nextInt());
		LOGGER.getInput("Enter accType:");
		b3.setAccType(s.next());
		LOGGER.getInput("availableBalance:");
		b3.setAvailableBalance(s.nextInt());
		
		AccountDAO dao=DAOFactory.getAccountDAO();
		try {
			dao.addAccount(b1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dao.addAccount(b2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dao.addAccount(b3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}

}
