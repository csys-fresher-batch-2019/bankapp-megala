package com.beneficiary;

import java.util.Scanner;

import beneficiary.BeneficiaryDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestUpdateBeneficiary {
	private static final Logger LOGGER=Logger.getInstance();
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter name:");
		String name=s.next();
		LOGGER.getInput("Enter accNo:");
		long accNo=s.nextLong();
		BeneficiaryDAO dao=DAOFactory.getBeneficiaryDAO();
		try {
			dao.updateBeneficiary(name,accNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		s.close();
	}

}
