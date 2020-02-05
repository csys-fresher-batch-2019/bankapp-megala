package com.branch;

import java.util.Scanner;

import branch.BranchDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestDeleteBranch {
		private static final Logger LOGGER = Logger.getInstance();

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			LOGGER.getInput("Enter branchId:");
			int input=s.nextInt();
			BranchDAO dao=DAOFactory.getBranchDAO();
			try {
				dao.delete(input);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.close();
		}
	}
