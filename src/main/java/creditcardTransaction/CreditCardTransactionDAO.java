package creditcardtransaction;

import java.util.List;

public interface CreditCardTransactionDAO {
	public int addCreditCardTransaction(CreditCardTransaction creditCardTransaction) ;
	public List<CreditCardTransaction> displayCreditCardPaymentList() ;
		
}
