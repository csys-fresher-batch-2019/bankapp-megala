package com.transaction;

import java.util.Scanner;

import factory.DAOFactory;
import transaction.TransactionDAO;

public class TestUpdateTransaction {

	public static void main(String[] args) throws Exception {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter transactionAmount:");
		int amount= s1.nextInt();
		System.out.println("Enter beneficiaryaAccNo:");
		int beneficiaryAccNo= s1.nextInt();
		TransactionDAO dao1 =DAOFactory.getTransactionDAO();
		dao1.updateTransaction(amount,beneficiaryAccNo);
		s1.close();

	}

}
