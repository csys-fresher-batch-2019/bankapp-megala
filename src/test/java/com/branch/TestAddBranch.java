package com.branch;

import java.util.Scanner;

import branch.Branch;
import branch.BranchDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestAddBranch {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args) throws IllegalAccessException  {
		// TODO Auto-generated method stub

		Branch b1=new Branch();
		Scanner s1=new Scanner(System.in);
		LOGGER.getInput("Enter branchId:");
		b1.setId(s1.nextInt());
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
		try {
			dao.addBranch(b1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			dao.addBranch(b2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			dao.addBranch(b3);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			dao.addBranch(b4);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		BranchDAO dao2=DAOFactory.getBranchDAO();
//		dao2.addBranch(b3);
//	
//		BranchDAO dao3=DAOFactory.getBranchDAO();
//		dao.addBranch(b4);
		
		
		s1.close();


	}


	}

