package transaction;

import java.util.List;

public interface TransactionDAO {
	public void addTransaction(Transaction transaction) ;
	public List<Transaction> displayTransaction() ;
	public void updateTransaction(int transactionAmount,int transactionId) ;
	public void deleteTransaction(int transactionId) ; 
}
