package com.creditcard;

import creditcard.CreditCardDAO;
import daoFactory.DAOFactory;

public class TestDisplayCreditCard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CreditCardDAO dao =DAOFactory.getCreditCardDAO();
		dao.displayCreditCard();

	}

}
