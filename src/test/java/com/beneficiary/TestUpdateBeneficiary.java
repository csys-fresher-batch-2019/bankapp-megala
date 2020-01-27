package com.beneficiary;

import beneficiary.BeneficiaryDAOImpl;

public class TestUpdateBeneficiary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BeneficiaryDAOImpl daoImpl=new BeneficiaryDAOImpl();
		daoImpl.updateBeneficiary("mega",11166);
	}

}
