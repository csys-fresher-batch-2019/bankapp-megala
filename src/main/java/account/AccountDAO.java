package account;

import java.util.List;

public interface AccountDAO {
	public void addAccount(Account account) throws Exception;
	public List<Account> displayAcc() throws Exception;
	public void updateAccount(int Id, int accNo) throws Exception;
	public void deleteAccount(int accNo) throws Exception;
	public void searchByAccountNo(int accNo) throws Exception;
	public void displayAccount1(int id) throws Exception;
	public void displayBalance(int accNo) throws Exception;
	
}
