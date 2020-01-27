package com.branch;

import branch.BranchDAOImpl;

public class TestUpdateBranch {
	public static void main(String[] args) throws Exception {

		BranchDAOImpl dao = new BranchDAOImpl();
		dao.updateBranch("sulur", 1);

	}
}
