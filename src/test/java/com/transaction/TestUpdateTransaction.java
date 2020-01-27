package com.transaction;

import transaction.TransactionDAOImpl;

public class TestUpdateTransaction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TransactionDAOImpl dao1 = new TransactionDAOImpl();
		dao1.updateTransaction(100000,3);

	}

}
