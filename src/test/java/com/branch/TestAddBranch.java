package com.branch;

import java.util.Scanner;

import branch.Branch;
import branch.BranchDAO;
import daofactory.DAOFactory;
import logger.Logger;

public class TestAddBranch {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args) throws IllegalAccessException  {

		Branch b1=new Branch();
		Scanner s1=new Scanner(System.in);
		LOGGER.getInput("Enter branchId:");
		b1.setId(s1.nextInt());
		LOGGER.getInput("Enter branchName:");
		b1.setName(s1.next());
		LOGGER.getInput("Enter branchCity");
		b1.setCity(s1.next());
		
		Branch b2=new Branch();
		LOGGER.getInput("Enter branchId:");
		int c=s1.nextInt();
		b2.setId(c);
		LOGGER.getInput("Enter branchName:");
		b2.setName(s1.next());
		LOGGER.getInput("Enter branchCity");
		b2.setCity(s1.next());
		
		Branch b3=new Branch();
		LOGGER.getInput("Enter branchId:");
		int d=s1.nextInt();
		b3.setId(d);
		LOGGER.getInput("Enter branchName:");
		b3.setName(s1.next());
		LOGGER.getInput("Enter branchCity");
		b3.setCity(s1.next());
		
		Branch b4=new Branch();
		LOGGER.getInput("Enter branchId:");
		int e=s1.nextInt();
		b4.setId(e);
		LOGGER.getInput("Enter branchName:");
		b4.setName(s1.next());
		LOGGER.getInput("Enter branchCity");
		b4.setCity(s1.next());
		

		
		BranchDAO dao=DAOFactory.getBranchDAO();
		try {
			dao.addBranch(b1);
		} catch (Exception e1) {
						e1.printStackTrace();
		}
		try {
			dao.addBranch(b2);
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		try {
			dao.addBranch(b3);
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
		try {
			dao.addBranch(b4);
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}

		
		s1.close();


	}


	}

