package com.account;

import account.AccountDAOImpl;

public class TestDeleteAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AccountDAOImpl daoImpl=new AccountDAOImpl();
		daoImpl.deleteAccount(11177);

	}

}
