package account;

import java.util.List;

public interface AccountDAO {
	public void addAccount(Account account) ;
	public List<Account> displayAcc();
	public void updateAccount(int id, int accNo) ;
	public void deleteAccount(int accNo) ;
	public void searchByAccountNo(int accNo) ;
	public void displayAccount1(int id) ;
	public void displayBalance(int accNo) ;
	
}
