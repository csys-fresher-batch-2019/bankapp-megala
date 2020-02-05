package transaction;

import java.util.List;

public interface TransactionDAO {
	public void addTransaction(Transaction transaction) throws Exception;
	public List<Transaction> displayTransaction() throws Exception;
	public void updateTransaction(int transactionAmount,int transactionId) throws Exception;
	public void deleteTransaction(int transactionId) throws Exception; 
}
