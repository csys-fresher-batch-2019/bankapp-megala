package com.transaction;

import daofactory.DAOFactory;
import transaction.TransactionDAO;

public class TestDisplayTransaction {

	public static void main(String[] args) throws Exception {
		TransactionDAO dao1 =DAOFactory.getTransactionDAO();
		dao1.displayTransaction();
	}

}
