package com.branch;

import java.util.Scanner;

import branch.BranchDAOImpl;

public class TestDeleteBranch {
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("Enter branchId:");
			int input=s.nextInt();
			BranchDAOImpl dao=new BranchDAOImpl();
			dao.delete(input);
			s.close();
		}
	}
