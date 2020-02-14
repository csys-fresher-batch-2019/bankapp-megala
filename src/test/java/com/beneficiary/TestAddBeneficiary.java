package com.beneficiary;

import java.util.Scanner;

import beneficiary.Beneficiary;
import beneficiary.BeneficiaryDAO;
import factory.DAOFactory;
import logger.Logger;

public class TestAddBeneficiary {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args)  {
		Beneficiary b1=new Beneficiary();
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter beneficiary name:");
		b1.setBeneficiaryName(s.next());
		LOGGER.getInput("Enter beneficiary accNo:");
		b1.setAccNo(s.nextLong());
		LOGGER.getInput("Enter IFSC code:");
		b1.setiFSCCode(s.next());
		
		
		Beneficiary b2=new Beneficiary();
		LOGGER.getInput("Enter beneficiary name:");
		b2.setBeneficiaryName(s.next());
		LOGGER.getInput("Enter beneficiary accNo:");
		b2.setAccNo(s.nextLong());
		LOGGER.getInput("Enter IFSC code:");
		b2.setiFSCCode(s.next());
		
		Beneficiary b3=new Beneficiary();
		LOGGER.getInput("Enter beneficiary name:");
		b3.setBeneficiaryName(s.next());
		LOGGER.getInput("Enter beneficiary accNo:");
		b3.setAccNo(s.nextLong());
		LOGGER.getInput("Enter IFSC code:");
		b3.setiFSCCode(s.next());
		
		BeneficiaryDAO dao=DAOFactory.getBeneficiaryDAO();
		try {
			dao.addBeneficiary(b1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			dao.addBeneficiary(b2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			dao.addBeneficiary(b3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		s.close();

	}

}
