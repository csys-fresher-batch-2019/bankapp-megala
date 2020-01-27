package com.account;

import account.AccountDAOImpl;

public class TestSearchByAccNo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AccountDAOImpl daoImpl=new AccountDAOImpl();
		daoImpl.searchByAccountNo(11166);

	}

}
