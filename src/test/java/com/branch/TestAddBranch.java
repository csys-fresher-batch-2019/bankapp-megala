package com.branch;

import java.util.Scanner;

import branch.Branch;
import branch.BranchDAOImpl;

public class TestAddBranch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Branch b1=new Branch();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter branchId:");
		int b=s1.nextInt();
		b1.setId(b);
		System.out.println("Enter branchName:");
		b1.name=s1.next();
		System.out.println("Enter branchCity");
		b1.city=s1.next();
		
		Branch b2=new Branch();
		System.out.println("Enter branchId:");
		int c=s1.nextInt();
		b2.setId(c);
		System.out.println("Enter branchName:");
		b2.name=s1.next();
		System.out.println("Enter branchCity");
		b2.city=s1.next();
		
		Branch b3=new Branch();
		System.out.println("Enter branchId:");
		int d=s1.nextInt();
		b3.setId(d);
		System.out.println("Enter branchName:");
		b3.name=s1.next();
		System.out.println("Enter branchCity");
		b3.city=s1.next();
		
		Branch b4=new Branch();
		System.out.println("Enter branchId:");
		int e=s1.nextInt();
		b4.setId(e);
		System.out.println("Enter branchName:");
		b4.name=s1.next();
		System.out.println("Enter branchCity");
		b4.city=s1.next();
		
		BranchDAOImpl daoImpl=new BranchDAOImpl();
		daoImpl.addBranch(b1);
		
		BranchDAOImpl daoImpl2=new BranchDAOImpl();
		daoImpl2.addBranch(b2);
		
		BranchDAOImpl daoImpl3=new BranchDAOImpl();
		daoImpl3.addBranch(b3);

		BranchDAOImpl daoImpl4=new BranchDAOImpl();
		daoImpl4.addBranch(b4);
		
		s1.close();


	}


	}

