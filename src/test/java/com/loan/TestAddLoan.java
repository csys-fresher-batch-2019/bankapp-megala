package com.loan;

import java.util.Scanner;

import factory.DAOFactory;
import loan.Loan;
import loan.LoanDAO;
import loan.LoanStatusEnum;
import logger.Logger;

public class TestAddLoan {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args) throws Exception {
		Loan b1=new Loan();
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter customerId:");
		b1.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter branchName:");
		b1.setBranchName(s.next());
		LOGGER.getInput("Enter loanNo:");
		b1.setLoanNo(s.next());
		LOGGER.getInput("Enter amount:");
		b1.setAmount(s.nextInt());
		b1.setStatus(LoanStatusEnum.PENDING);
		Loan b2=new Loan();
		
		LOGGER.getInput("Enter customerId:");
		b2.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter branchName:");
		b2.setBranchName(s.next());
		LOGGER.getInput("Enter loanNo:");
		b2.setLoanNo(s.next());
		LOGGER.getInput("Enter amount:");
		b2.setAmount(s.nextInt());
		b2.setStatus(LoanStatusEnum.PENDING);
		
		Loan b3=new Loan();
		LOGGER.getInput("Enter customerId:");
		b3.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter branchName:");
		b3.setBranchName(s.next());
		LOGGER.getInput("Enter loanNo:");
		b3.setLoanNo(s.next());
		LOGGER.getInput("Enter amount:");
		b3.setAmount(s.nextInt());
		b3.setStatus(LoanStatusEnum.PENDING);
	
		Loan b4=new Loan();
		LOGGER.getInput("Enter customerId:");
		b4.setCustomerId(s.nextInt());
		LOGGER.getInput("Enter branchName:");
		b4.setBranchName(s.next());
		LOGGER.getInput("Enter loanNo:");
		b4.setLoanNo(s.next());
		LOGGER.getInput("Enter amount:");
		b4.setAmount(s.nextInt());
		b4.setStatus(LoanStatusEnum.PENDING);

		LoanDAO dao=DAOFactory.getLoanDAO();
		dao.addLoan(b1);
		dao.addLoan(b2);
		dao.addLoan(b3);
		dao.addLoan(b4);
		s.close();
		
	}

}
