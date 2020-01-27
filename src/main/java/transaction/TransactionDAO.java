package transaction;

import java.util.List;

public interface TransactionDAO {
	public void addTransaction(Transaction transaction) throws Exception;
	public List<Transaction> displayTransaction() throws Exception;

}
