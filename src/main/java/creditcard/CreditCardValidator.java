package creditcard;

import java.time.LocalDate;

public class CreditCardValidator {
	
	public static boolean validateCreditCard(long creditCardNo,LocalDate expiryDate) throws Exception {
		if(Long.toString(creditCardNo).length()<16 || Long.toString(creditCardNo).length()>16) {
			throw new Exception("Invalid credit card no");
		}
		else if(expiryDate.compareTo(LocalDate.now())<0) {
			throw new Exception("Your creditCard is expired");
			
		}
		return false;
		
		
	}

}
