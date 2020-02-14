package com.account;

import java.util.Scanner;

import account.AccountDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestDisplayBalance {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter accNo:");
		long accNo=s.nextLong();
		AccountDAO dao=DAOFactory.getAccountDAO();
		try {
			dao.displayBalance(accNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}

}
