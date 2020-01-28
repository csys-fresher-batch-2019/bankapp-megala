package com.branch;

import java.util.Scanner;

import branch.Branch;
import branch.BranchDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestAddBranch {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Branch b1=new Branch();
		Scanner s1=new Scanner(System.in);
		LOGGER.getInput("Enter branchId:");
		int b=s1.nextInt();
		b1.setId(b);
		LOGGER.getInput("Enter branchName:");
		b1.name=s1.next();
		LOGGER.getInput("Enter branchCity");
		b1.city=s1.next();
		
		Branch b2=new Branch();
		LOGGER.getInput("Enter branchId:");
		int c=s1.nextInt();
		b2.setId(c);
		LOGGER.getInput("Enter branchName:");
		b2.name=s1.next();
		LOGGER.getInput("Enter branchCity");
		b2.city=s1.next();
		
		Branch b3=new Branch();
		LOGGER.getInput("Enter branchId:");
		int d=s1.nextInt();
		b3.setId(d);
		LOGGER.getInput("Enter branchName:");
		b3.name=s1.next();
		LOGGER.getInput("Enter branchCity");
		b3.city=s1.next();
		
		Branch b4=new Branch();
		LOGGER.getInput("Enter branchId:");
		int e=s1.nextInt();
		b4.setId(e);
		LOGGER.getInput("Enter branchName:");
		b4.name=s1.next();
		LOGGER.getInput("Enter branchCity");
		b4.city=s1.next();
		
//		BranchDAO dao=new BranchDAOImpl();
//		dao.addBranch(b1);
		
		BranchDAO dao=DAOFactory.getBranchDAO();
		dao.addBranch(b1);
		dao.addBranch(b2);
		dao.addBranch(b3);
		dao.addBranch(b4);
		
//		BranchDAO dao2=DAOFactory.getBranchDAO();
//		dao2.addBranch(b3);
//	
//		BranchDAO dao3=DAOFactory.getBranchDAO();
//		dao.addBranch(b4);
		
		
		s1.close();


	}


	}

