package com.transaction;

import java.time.LocalDateTime;

import transaction.Transaction;
import transaction.TransactionDAOImpl;

public class TestAddTransaction {
	public static void main(String[] args) throws Exception {
		Transaction c1 = new Transaction(); 
		c1.transactionId = 4;
		c1.beneficiaryAccNo = 11177;
		c1.transactionDate = LocalDateTime.parse("2020-10-21T11:00:00");
		c1.transactionAmount = 1000;
		

		Transaction c2 = new Transaction();
		c2.transactionId = 5;
		c2.beneficiaryAccNo = 11188;
		c2.transactionAmount = 5000;
		c2.transactionDate = LocalDateTime.parse("2020-10-21T12:50:00");;
	

		/*Transaction c3 = new Transaction();
		LocalDate expiryDate2 = LocalDate.parse("2022-12-12");
		c3.transactionId = 131187;
		c3.beneficiaryAccNo = 11177;
		c3.transactionAmount = 2000;
		c3.transactionDate = expiryDate2;
		
*/
		TransactionDAOImpl dao = new TransactionDAOImpl();
		dao.addTransaction(c1);

		TransactionDAOImpl dao1 = new TransactionDAOImpl();
		dao1.addTransaction(c2);

	/*	TransactionDAOImpl dao2 = new TransactionDAOImpl();
		dao2.addTransaction(c3);
*/
	}

	}

