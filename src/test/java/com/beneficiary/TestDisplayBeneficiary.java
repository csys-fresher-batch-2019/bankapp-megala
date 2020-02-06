package com.beneficiary;

import beneficiary.BeneficiaryDAO;
import daofactory.DAOFactory;

public class TestDisplayBeneficiary {

	public static void main(String[] args) {
		BeneficiaryDAO dao=DAOFactory.getBeneficiaryDAO();
		try {
			dao.displayBeneficiary();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
