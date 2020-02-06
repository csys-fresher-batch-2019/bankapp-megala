package com.branch;

import java.util.Scanner;

import branch.BranchDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestUpdateBranch {
	private static final Logger LOGGER = Logger.getInstance();
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter branchName:");
		String name=s.nextLine();
		LOGGER.getInput("Enter branchId:");
		int id=s.nextInt();
		BranchDAO dao = DAOFactory.getBranchDAO();
		try {
			dao.updateBranch(name,id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		s.close();

	}
}
