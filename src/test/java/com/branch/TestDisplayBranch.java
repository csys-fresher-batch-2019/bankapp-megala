package com.branch;

import branch.BranchDAO;
import daoFactory.DAOFactory;

public class TestDisplayBranch {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		BranchDAO dao = DAOFactory.getBranchDAO();
		try {
			dao.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
