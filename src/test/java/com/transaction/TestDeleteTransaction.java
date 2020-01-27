package com.transaction;

import transaction.TransactionDAOImpl;

public class TestDeleteTransaction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TransactionDAOImpl dao1 = new TransactionDAOImpl();
		dao1.deleteTransaction(5);
	}

}
