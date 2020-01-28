package com.account;

import account.AccountDAO;
import daoFactory.DAOFactory;

public class TestDisplayAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AccountDAO dao=DAOFactory.getAccountDAO();
		dao.displayAcc();
	}

}
