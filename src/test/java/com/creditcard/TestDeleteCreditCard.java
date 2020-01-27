package com.creditcard;

import creditcard.CreditCardDAOImpl;

public class TestDeleteCreditCard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CreditCardDAOImpl dao2 = new CreditCardDAOImpl();
		dao2.deleteCreditCard("11111");

	}

}
