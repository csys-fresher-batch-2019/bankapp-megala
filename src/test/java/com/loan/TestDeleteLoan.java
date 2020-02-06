package com.loan;

import java.util.Scanner;

import daofactory.DAOFactory;
import loan.LoanDAO;
import logger.Logger;

public class TestDeleteLoan {
	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter loanNo:");
		String loanNo=s.next();
		LoanDAO daoImpl=DAOFactory.getLoanDAO();
		daoImpl.deleteLoan(loanNo);
		s.close();

	}

}
