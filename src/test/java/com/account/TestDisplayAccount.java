package com.account;

import account.AccountDAO;
import factory.DAOFactory;

public class TestDisplayAccount {

	public static void main(String[] args) {
		AccountDAO dao=DAOFactory.getAccountDAO();
		try {
			dao.displayAcc();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
