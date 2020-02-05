package loan;

import java.util.List;

public interface LoanDAO {
	void addLoan(Loan loan) throws Exception;
	public List<Loan> displayLoan() throws Exception;
	public void updateLoan(LoanStatusEnum status, int id) throws Exception;
	public void deleteLoan(String loanNo) throws Exception;
		 

}
