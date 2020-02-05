package com.loan;

import daoFactory.DAOFactory;
import loan.LoanDAO;

public class TestDisplayLoan {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LoanDAO dao=DAOFactory.getLoanDAO();
		dao.displayLoan();
	}

}
