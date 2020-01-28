package com.account;

import java.util.Scanner;

import account.AccountDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestUpdateAccount {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter available balance:");
		int balance=s.nextInt();
		LOGGER.getInput("Enter customerId:");
		int id=s.nextInt();
		AccountDAO dao=DAOFactory.getAccountDAO();
		dao.updateAccount(balance,id);
		s.close();
	}

}
