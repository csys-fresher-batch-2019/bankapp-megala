package com.branch;

import java.util.Scanner;

import branch.BranchDAOImpl;

public class TestUpdateBranch {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter branchName:");
		String name=s.nextLine();
		System.out.println("Enter branchId:");
		int id=s.nextInt();
		BranchDAOImpl dao = new BranchDAOImpl();
		dao.updateBranch(name,id);

	}
}
