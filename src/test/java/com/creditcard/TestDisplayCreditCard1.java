package com.creditcard;

import java.time.LocalDate;

import creditcard.CreditCardDAO;
import factory.DAOFactory;

public class TestDisplayCreditCard1 {

	public static void main(String[] args)  {
		CreditCardDAO dao =DAOFactory.getCreditCardDAO();
		int id = 0;
		try {
			id = dao.displayCreditCard(1111111111111111L,LocalDate.parse("2020-09-08"),123);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(id);
	}

}
