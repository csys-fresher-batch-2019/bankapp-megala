package com.transaction;

import factory.DAOFactory;
import transaction.TransactionDAO;

public class TestDisplayTransaction {

	public static void main(String[] args) throws Exception {
		TransactionDAO dao1 =DAOFactory.getTransactionDAO();
		dao1.displayTransaction();
	}

}
