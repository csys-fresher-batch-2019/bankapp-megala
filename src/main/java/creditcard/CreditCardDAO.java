package creditcard;

import java.time.LocalDate;
import java.util.List;

public interface CreditCardDAO {
	public void addCreditCard(CreditCard creditCard) throws Exception;
	public List<CreditCard> displayCreditCards() throws Exception;
	public void updateCreditCard1(String comments,long creditCardNo,boolean blocked) throws Exception;
	public void deleteCreditCard(String accNo) throws Exception;
	public int displayCreditCard(long cardNo,LocalDate expiryDate,int cvvNo) throws ClassNotFoundException;
}