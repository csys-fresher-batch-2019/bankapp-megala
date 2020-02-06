package com.creditcard;

import java.time.LocalDate;

import creditcard.CreditCardDAO;
import factory.DAOFactory;

public class TestDisplayCreditCard1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		CreditCardDAO dao =DAOFactory.getCreditCardDAO();
		int id = 0;
		try {
			id = dao.displayCreditCard(9999999999999999L,LocalDate.parse("2020-02-30"),123);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id);
	}

}
