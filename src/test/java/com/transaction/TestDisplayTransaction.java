package com.transaction;

import daoFactory.DAOFactory;
import transaction.TransactionDAO;

public class TestDisplayTransaction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TransactionDAO dao1 =DAOFactory.getTransactionDAO();
		dao1.displayTransaction();
	}

}
