package com.branch;

import branch.BranchDAOImpl;

public class TestDeleteBranch {
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			BranchDAOImpl dao=new BranchDAOImpl();
			dao.delete(2);

		}
	}
