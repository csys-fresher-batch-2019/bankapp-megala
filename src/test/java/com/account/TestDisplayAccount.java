package com.account;

import account.AccountDAO;
import daoFactory.DAOFactory;

public class TestDisplayAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDAO dao=DAOFactory.getAccountDAO();
		try {
			dao.displayAcc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
