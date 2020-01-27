package com.loan;

import loan.Loan;
import loan.LoanDAOImpl;

public class TestAddLoan {
	public static void main(String[] args) throws Exception {
		Loan b1=new Loan();
		b1.customerId=1;
		b1.branchName="vellalore";
		b1.loanNo="A765757";
		b1.amount=1220000;
		b1.status=LoanStatusEnum.PENDING;
		
		Loan b2=new Loan();
		b2.customerId=2;
		b2.branchName="varadharajapuram";
		b2.loanNo="765753";
		b2.amount=600000;
		b2.status=LoanStatusEnum.CLOSED;
		
		Loan b3=new Loan();
		b3.customerId=3;
		b3.branchName="ayanavaram";
		b3.loanNo="986580";
		b3.amount=120000;
		
		Loan b4=new Loan();
		b4.customerId=4;
		b4.branchName="podanur";
		b4.loanNo="S123464";
		b4.amount=250000;
		b4.status=LoanStatusEnum.PENDING;
		LoanDAOImpl daoImpl=new LoanDAOImpl();
		daoImpl.addLoan(b1);
		
		LoanDAOImpl daoImpl2=new LoanDAOImpl();
		daoImpl2.addLoan(b2);
		
		LoanDAOImpl daoImpl3=new LoanDAOImpl();
		daoImpl3.addLoan(b3);

		LoanDAOImpl daoImpl4=new LoanDAOImpl();
		daoImpl4.addLoan(b4);

	}

}
