package com.account;

import account.AccountDAOImpl;

public class TestUpdateAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AccountDAOImpl daoImpl=new AccountDAOImpl();
		daoImpl.updateAccount(11120,3);
	}

}
