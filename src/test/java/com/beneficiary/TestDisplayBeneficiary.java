package com.beneficiary;

import beneficiary.BeneficiaryDAO;
import daoFactory.DAOFactory;

public class TestDisplayBeneficiary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BeneficiaryDAO dao=DAOFactory.getBeneficiaryDAO();
		dao.displayBeneficiary();
	}

}
