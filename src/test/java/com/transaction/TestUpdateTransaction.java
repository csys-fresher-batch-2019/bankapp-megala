package com.transaction;

import java.util.Scanner;


import transaction.TransactionDAOImpl;

public class TestUpdateTransaction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter transactionAmount:");
		int amount= s1.nextInt();
		System.out.println("Enter transactionId:");
		int id= s1.nextInt();
		TransactionDAOImpl dao1 = new TransactionDAOImpl();
		dao1.updateTransaction(amount,id);
		s1.close();

	}

}
