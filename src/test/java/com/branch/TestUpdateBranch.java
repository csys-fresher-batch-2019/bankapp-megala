package com.branch;

import java.util.Scanner;

import branch.BranchDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestUpdateBranch {
	private static final Logger LOGGER = Logger.getInstance();
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter branchName:");
		String name=s.nextLine();
		LOGGER.getInput("Enter branchId:");
		int id=s.nextInt();
		BranchDAO dao = DAOFactory.getBranchDAO();
		dao.updateBranch(name,id);
		s.close();

	}
}
