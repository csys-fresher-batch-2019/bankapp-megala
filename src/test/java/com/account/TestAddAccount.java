package com.account;

import account.AccountDAOImpl;

import java.util.Scanner;

import account.Account;

public class TestAddAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Account b1=new Account();
//		b1.customerId=3;
//		b1.accNo=11188;
//		b1.accType="saving";
//		b1.availableBalance=12340;
		
		Account b1=new Account();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter customerId:");
		b1.customerId=s.nextInt();
		System.out.println("Enter accNo:");
		b1.accNo=s.nextInt();
		System.out.println("Enter accType:");
		b1.accType=s.next();
		System.out.println("availableBalance:");
		b1.availableBalance=s.nextInt();
		
		Account b2=new Account();
		b2.customerId=2;
		b2.accNo=11166;
		b2.accType="salaried";
		b2.availableBalance=20000;
		
		Account b3=new Account();
		b3.customerId=1;
		b3.accNo=11177;
		b3.accType="saving";
		b3.availableBalance=54000;
		
		AccountDAOImpl daoImpl1=new AccountDAOImpl();
		daoImpl1.addAccount(b1);
		
		AccountDAOImpl daoImpl2=new AccountDAOImpl();
		daoImpl2.addAccount(b2);
		
		AccountDAOImpl daoImpl3=new AccountDAOImpl();
		daoImpl3.addAccount(b3);

	}

}
