package com.loan;

import loan.LoanDAOImpl;

public class TestDeleteLoan {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LoanDAOImpl daoImpl=new LoanDAOImpl();
		daoImpl.deleteLoan("765753");

	}

}
