package com.beneficiary;

import beneficiary.BeneficiaryDAO;
import daoFactory.DAOFactory;

public class TestDisplayBeneficiary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeneficiaryDAO dao=DAOFactory.getBeneficiaryDAO();
		try {
			dao.displayBeneficiary();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
