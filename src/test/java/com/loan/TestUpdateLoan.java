package com.loan;

import loan.LoanDAOImpl;

public class TestUpdateLoan {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		
		LoanDAOImpl daoImpl=new LoanDAOImpl();
		daoImpl.updateLoan(LoanStatusEnum.APPROVED,1);
	}

}
