package com.loan;

import java.util.Scanner;

import daofactory.DAOFactory;
import loan.LoanDAO;
import loan.LoanStatusEnum;
import logger.Logger;

public class TestUpdateLoan {
	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter loanStatus:");
		LoanStatusEnum loanStatus=LoanStatusEnum.APPROVED;
		LOGGER.getInput("Enter loanNo:");
		int id=s.nextInt();
		
		LoanDAO dao=DAOFactory.getLoanDAO();
		dao.updateLoan(loanStatus,id);
		s.close();
	}

}
