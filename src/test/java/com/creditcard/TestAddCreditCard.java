package com.creditcard;
import java.time.LocalDate;

import creditcard.CreditCard;
import creditcard.CreditCardDAOImpl;


public class TestAddCreditCard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			CreditCard c1 = new CreditCard();
			LocalDate expiryDate = LocalDate.parse("2020-10-21");
			c1.creditCardNo = 121198;
			c1.accNo = 11188;
			c1.limitNo = 1000;
			c1.expiryDate = expiryDate;

			CreditCard c2 = new CreditCard();
			LocalDate expiryDate1 = LocalDate.parse("2020-11-01");
			c2.creditCardNo = 111119;
			c2.accNo = 11166;
			c2.limitNo = 5000;
			c2.expiryDate = expiryDate1;

			CreditCard c3 = new CreditCard();
			LocalDate expiryDate2 = LocalDate.parse("2022-12-12");
			c3.creditCardNo = 131187;
			c3.accNo = 11177;
			c3.limitNo = 2000;
			c3.expiryDate = expiryDate2;

			CreditCardDAOImpl dao = new CreditCardDAOImpl();
			dao.addCreditCard(c1);

			CreditCardDAOImpl dao1 = new CreditCardDAOImpl();
			dao1.addCreditCard(c2);

			CreditCardDAOImpl dao2 = new CreditCardDAOImpl();
			dao2.addCreditCard(c3);

		}

	}

