package com.loan;

import daofactory.DAOFactory;
import loan.LoanDAO;

public class TestDisplayLoan {

	public static void main(String[] args) throws Exception {
		LoanDAO dao=DAOFactory.getLoanDAO();
		dao.displayLoan();
	}

}
