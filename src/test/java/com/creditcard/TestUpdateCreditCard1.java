package com.creditcard;

import creditcard.CreditCard;
import creditcard.CreditCardDAOImpl;

public class TestUpdateCreditCard1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		
		CreditCard c1=new CreditCard();
		c1.comments="Lost";
		c1.creditCardNo=41116;
		c1.blocked=true;
		
		CreditCardDAOImpl dao2 = new CreditCardDAOImpl();
		dao2.updateCreditCard1(c1.comments,c1.creditCardNo,c1.blocked);

	}

}
