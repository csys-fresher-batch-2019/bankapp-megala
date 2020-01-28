package com.branch;

import java.util.Scanner;

import branch.BranchDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestDeleteBranch {
		private static final Logger LOGGER = Logger.getInstance();

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			LOGGER.getInput("Enter branchId:");
			int input=s.nextInt();
			BranchDAO dao=DAOFactory.getBranchDAO();
			dao.delete(input);
			s.close();
		}
	}
