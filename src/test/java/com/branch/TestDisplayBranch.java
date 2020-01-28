package com.branch;

import branch.BranchDAO;
import daoFactory.DAOFactory;

public class TestDisplayBranch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BranchDAO dao = DAOFactory.getBranchDAO();
		dao.list();

	}

}
