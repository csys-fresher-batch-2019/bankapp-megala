package creditcard;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.time.LocalDate;
import bank.util.ConnectionUtil;
import daoFactory.DAOFactory;

//import daoFactory.DAOFactory;

public class CreditCardService {

	public static boolean validateCreditCard(long creditCardNo,LocalDate expiryDate,int cvvNo) throws Exception {
		try {
			CreditCardValidator.validateCreditCard(creditCardNo,expiryDate,cvvNo);
			return true;
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
		

	}
	
	public static boolean validateCreditCard(long creditCardNo,int creditCardPin) {
		try {
			CreditCardValidator.validateCreditCard(creditCardNo,creditCardPin);
			return true;
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static boolean pay(CreditCard creditCard,float amount,String merchantId) throws Exception {
		boolean validate=CreditCardValidator.validateCreditCard(creditCard.getCardNo(), creditCard.getExpiryDate(), creditCard.getCvvNo());
		boolean validate1=CreditCardValidator.validateCreditCard(creditCard.getCardNo(), creditCard.getPin());
		boolean result=false;
		if(validate==true && validate1==true) {
			CreditCardDAO c1=DAOFactory.getCreditCardDAO();
			int ccId = c1.displayCreditCard(creditCard.getCardNo(),creditCard.getExpiryDate(),creditCard.getCvvNo());
			if(ccId>0) {
			Connection con = ConnectionUtil.getconnection();
			CallableStatement stmt=con.prepareCall("{call trans_procedure1(?,?,?,?)}");
			stmt.setLong(1, creditCard.getCardNo());
			stmt.setFloat(2,amount);
			stmt.setString(3, merchantId);
			stmt.registerOutParameter(4, Types.VARCHAR);
			stmt.executeUpdate();
			String status=stmt.getString(4);
				if(status.equals("Transaction Successfull"))
				{
					result=true;
				}
			}
		}
	
		return result;
	}
	}
/*	public static boolean registerCreditCard(CreditCard creditCard) throws Exception {
		
		boolean result ;
		try {
			CreditCardDAO dao=DAOFactory.getCreditCardDAO();
			CreditCardValidator.validateCreditCard(creditCard.getCreditCardNo(),creditCard.getExpiryDate());
			dao.addCreditCard(creditCard);
			result = true;
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Unable to register credit card: " + e.getMessage());
		}
		return result;
		

	}
*/
