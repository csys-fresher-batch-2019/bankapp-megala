package com.creditcard;

import creditcard.CreditCardDAO;
import daofactory.DAOFactory;

public class TestDisplayCreditCard {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		CreditCardDAO dao =DAOFactory.getCreditCardDAO();
		try {
			dao.displayCreditCards();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
