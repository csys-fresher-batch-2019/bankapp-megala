package account;

public class Account {
	private int customerId;
	private int accNo;
	private String accType;
	private int availableBalance;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		if(customerId<0){
			throw new IllegalArgumentException("Invalid number");
		}
		this.customerId = customerId;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(int availableBalance) {
		this.availableBalance = availableBalance;
	}

}
