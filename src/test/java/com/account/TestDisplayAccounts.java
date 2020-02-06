package com.account;

import account.AccountDAO;
import factory.DAOFactory;

public class TestDisplayAccounts {

	public static void main(String[] args)  {
		
		AccountDAO dao=DAOFactory.getAccountDAO();
		try {
			dao.displayAccount1(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
