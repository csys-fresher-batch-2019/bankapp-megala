package com.creditcard;

import java.time.LocalDate;

import creditcard.CreditCard;
import creditcard.CreditCardService;

public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard creditCard=new CreditCard();
		creditCard.setCardNo(9999999999999999L);
		creditCard.setExpiryDate(LocalDate.parse("2020-11-01"));
		creditCard.setCvvNo(124);
		creditCard.setPin(1111);
		
	
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
