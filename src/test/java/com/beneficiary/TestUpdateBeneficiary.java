package com.beneficiary;

import java.util.Scanner;

import beneficiary.BeneficiaryDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestUpdateBeneficiary {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter accNo:");
		String name=s.next();
		LOGGER.getInput("Enter accNo:");
		int accNo=s.nextInt();
		BeneficiaryDAO dao=DAOFactory.getBeneficiaryDAO();
		dao.updateBeneficiary(name,accNo);
		s.close();
	}

}
