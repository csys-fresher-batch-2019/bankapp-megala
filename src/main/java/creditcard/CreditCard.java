package creditcard;


import java.time.LocalDate;

public class CreditCard {
	private int creditCardNo;
	private int accNo;
	private int limitNo;
	private LocalDate expiryDate;
	private String comments;
	private boolean blocked=true;
	public int getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getLimitNo() {
		return limitNo;
	}
	public void setLimitNo(int limitNo) {
		this.limitNo = limitNo;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	
	

}
