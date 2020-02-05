package com.beneficiary;

import java.util.Scanner;

import beneficiary.BeneficiaryDAO;
import daoFactory.DAOFactory;
import logger.Logger;

public class TestDeleteBeneficiary {
	private static final Logger LOGGER=Logger.getInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LOGGER.getInput("Enter accNo:");
		int accNo=s.nextInt();
		BeneficiaryDAO dao=DAOFactory.getBeneficiaryDAO();
		try {
			dao.deleteBeneficiary(accNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
		
	}

}
