package creditcardtrans;

import java.util.List;

public interface CreditCardTransactionDAO {
	public int addCreditCardTransaction(CreditCardTransaction creditCardTransaction) ;
	public List<CreditCardTransaction> displayCreditCardPaymentList() ;
	public List<CreditCardTransaction> displayTransactionHistory(long cardId);	
}
