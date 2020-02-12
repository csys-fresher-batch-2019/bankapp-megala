package com.creditcard;

import java.time.LocalDate;

import creditcard.CreditCard;
import creditcard.CreditCardService;
import creditcard.PaymentResponse;

public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard creditCard=new CreditCard();
		creditCard.setCardNo(1111111111111111L);
		creditCard.setExpiryDate(LocalDate.parse("2020-09-08"));
		creditCard.setCvvNo(123);
		creditCard.setPin(1234);
		
	
			try {
				String id="superMarket";
				PaymentResponse obj=CreditCardService.pay(creditCard, 100,id);
				System.out.println(obj.getTransactionId());
				System.out.println(obj.isStatus());
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		

	}

}
