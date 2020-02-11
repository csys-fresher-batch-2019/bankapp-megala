package com.creditcard;

import java.time.LocalDate;

import creditcard.CreditCard;
import creditcard.CreditCardService;

public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard creditCard=new CreditCard();
		creditCard.setCardNo(1111111111111111L);
		creditCard.setExpiryDate(LocalDate.parse("2020-09-08"));
		creditCard.setCvvNo(123);
		//creditCard.setPin(1234);
		
	
			try {
				String id="superMarket";
				boolean status=CreditCardService.pay(creditCard, 1000.244f,id);
				System.out.println(status);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
		
		

	}

}
