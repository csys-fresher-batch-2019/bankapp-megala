package com.account;

import java.util.Scanner;

import account.AccountDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestDeleteAccount {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerId:");
		int id=s.nextInt();
		AccountDAO dao=DAOFactory.getAccountDAO();
		dao.deleteAccount(id);
		s.close();

	}

}
