package creditcard;

import java.time.LocalDate;
import java.util.List;

public interface CreditCardDAO {
	public void addCreditCard(CreditCard creditCard) ;
	public List<CreditCard> displayCreditCards() ;
	public void updateCreditCard1(String comments,long creditCardNo,boolean blocked) ;
	public void deleteCreditCard(long accNo) ;
	public int displayCreditCard(long cardNo,LocalDate expiryDate,int cvvNo);
	public float displayBalance(long cardNo);	
}