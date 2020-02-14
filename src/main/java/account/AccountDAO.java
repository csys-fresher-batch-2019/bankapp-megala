package account;

import java.util.List;

public interface AccountDAO {
	public void addAccount(Account account) ;
	public List<Account> displayAcc();
	public void updateAccount(long accNo,int id) ;
	public void deleteAccount(long accNo) ;
	public List<Account> searchByAccountNo(long accNo) ;
	public void displayAccount1(int id) ;
	public void displayBalance(long accNo) ;
	
}
