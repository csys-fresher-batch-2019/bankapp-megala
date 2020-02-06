package com.account;

import java.util.Scanner;

import account.AccountDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestDeleteAccount {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerId:");
		int id=s.nextInt();
		AccountDAO dao=DAOFactory.getAccountDAO();
		try {
			dao.deleteAccount(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();

	}

}
