package com.account;

import account.AccountDAO;
import daoFactory.DAOFactory;

public class TestDisplayAccounts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AccountDAO dao=DAOFactory.getAccountDAO();
		dao.displayAccount1(3);

	}

}
