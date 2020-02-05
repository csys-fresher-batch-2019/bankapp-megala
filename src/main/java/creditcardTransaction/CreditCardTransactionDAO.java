package creditcardTransaction;

import java.util.List;

public interface CreditCardTransactionDAO {
	public int addCreditCardTransaction(CreditCardTransaction creditCardTransaction) throws Exception;
	public List<CreditCardTransaction> displayCreditCardPaymentList() throws Exception;
		
}
