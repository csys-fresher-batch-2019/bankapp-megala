package com.creditcard;

import creditcard.CreditCardDAO;
import factory.DAOFactory;

public class TestDisplayCreditCard {

	public static void main(String[] args){
		CreditCardDAO dao =DAOFactory.getCreditCardDAO();
		try {
			dao.displayCreditCards();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
