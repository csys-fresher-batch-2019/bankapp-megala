package com.beneficiary;

import beneficiary.Beneficiary;
import beneficiary.BeneficiaryDAOImpl;

public class TestAddBeneficiary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Beneficiary b1=new Beneficiary();
		b1.beneficiaryName="dhiya";
		b1.accNo=11188;
		b1.iFSCCode="64564674FG";
		
		
		Beneficiary b2=new Beneficiary();
		b2.beneficiaryName="shree";
		b2.accNo=11166;
		b2.iFSCCode="657656GJK";
		
		Beneficiary b3=new Beneficiary();
		b3.beneficiaryName="prabhu";
		b3.accNo=11177;
		b3.iFSCCode="1642FG";
		
		BeneficiaryDAOImpl daoImpl1=new BeneficiaryDAOImpl();
		daoImpl1.addBeneficiary(b1);
		
		BeneficiaryDAOImpl daoImpl2=new BeneficiaryDAOImpl();
		daoImpl2.addBeneficiary(b2);
		
		BeneficiaryDAOImpl daoImpl3=new BeneficiaryDAOImpl();
		daoImpl3.addBeneficiary(b3);


	}

}
