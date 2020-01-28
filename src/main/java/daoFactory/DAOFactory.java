package daoFactory;

import account.AccountDAO;
import account.AccountDAOImpl;
import beneficiary.BeneficiaryDAO;
import beneficiary.BeneficiaryDAOImpl;
import branch.BranchDAO;
import branch.BranchDAOImpl;
import creditcard.CreditCardDAO;
import creditcard.CreditCardDAOImpl;
import customer.CustomerDAO;
import customer.CustomerDAOImpl;
import loan.LoanDAO;
import loan.LoanDAOImpl;
import transaction.TransactionDAO;
import transaction.TransactionDAOImpl;

public class DAOFactory {

	public static BranchDAO getBranchDAO() {
		BranchDAO branchDAO=new BranchDAOImpl();
		return branchDAO;
	}
	public static CustomerDAO getCustomerDAO() {
		CustomerDAO customerDAO=new CustomerDAOImpl();
		return customerDAO;
	}
	public static AccountDAO getAccountDAO() {
		AccountDAO accountDAO=new AccountDAOImpl();
		return accountDAO;
	}
	public static LoanDAO getLoanDAO() {
		LoanDAO loanDAO=new LoanDAOImpl();
		return loanDAO;
	}
	public static CreditCardDAO getCreditCardDAO() {
		CreditCardDAO creditCard=new CreditCardDAOImpl();
		return creditCard;
	}
	
	public static BeneficiaryDAO getBeneficiaryDAO() {
		BeneficiaryDAO beneficiaryDAO=new BeneficiaryDAOImpl();
		return beneficiaryDAO;

}
	public static TransactionDAO getTransactionDAO() {
		TransactionDAO transactionDAO=new TransactionDAOImpl();
		return transactionDAO;
	}
}
	
