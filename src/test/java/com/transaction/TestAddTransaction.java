package com.transaction;

import java.time.LocalDateTime;
import java.util.Scanner;

import transaction.Transaction;
import transaction.TransactionDAOImpl;

public class TestAddTransaction {
	public static void main(String[] args) throws Exception {
		Transaction c1 = new Transaction(); 
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter transactionId:");
		c1.transactionId = s1.nextInt();
		System.out.println("Enter beneficiaryNo:");
		c1.beneficiaryAccNo = s1.nextInt();
		System.out.println("Enter transactionDate:");
		c1.transactionDate = LocalDateTime.parse(s1.next());
		System.out.println("Enter transactionAmount:");
		c1.transactionAmount = s1.nextInt();
		

		Transaction c2 = new Transaction();
		System.out.println("Enter transactionId:");
		c2.transactionId = s1.nextInt();
		System.out.println("Enter beneficiaryNo:");
		c2.beneficiaryAccNo = s1.nextInt();
		System.out.println("Enter transactionDate:");
		c2.transactionDate = LocalDateTime.parse(s1.next());
		System.out.println("Enter transactionAmount:");
		c2.transactionAmount = s1.nextInt();

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
		
		s1.close();
	}

	}

