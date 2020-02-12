package creditcard;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.time.LocalDate;
import bank.util.ConnectionUtil;
import factory.DAOFactory;
import logger.Logger;


public class CreditCardService {
	 private CreditCardService() {
	    throw new IllegalStateException("Utility class");
	  }

	private static final Logger LOGGER = Logger.getInstance();

	public static boolean validateCreditCard(long creditCardNo,LocalDate expiryDate,int cvvNo)  {
		try {
			CreditCardValidator.validateCreditCard(creditCardNo,expiryDate,cvvNo);
			return true;
			
		}
		catch(Exception e) {
				
				LOGGER.error(e);
		}
		return false;
		

	}
	
	
	public static boolean checkLogin1(CreditCard creditCard)  {
		boolean result = false;
		try(Connection con = ConnectionUtil.getconnection();
				CallableStatement stmt=con.prepareCall("{call login_procedure1(?,?,?)}")){
				stmt.setLong(1, creditCard.getCardNo());
				stmt.setInt(2, creditCard.getPin());
				stmt.registerOutParameter(3, Types.VARCHAR);
				stmt.executeUpdate();
				String status=stmt.getString(3);
					if(status.equals("Login Successfull"))
					{
						result=true;
					}
				}catch(Exception e) {
					LOGGER.error(e);
				}
		
		return result;

	}
	public static boolean validateCreditCard(long creditCardNo,int creditCardPin) {
		try {
			CreditCardValidator.validateCreditCard(creditCardNo,creditCardPin);
			return true;
			
		}
		catch(Exception e) {
			LOGGER.error(e);
		}
		return false;
	}
	public static PaymentResponse pay(CreditCard creditCard,float amount,String merchantId)  {
		
		PaymentResponse response = null;
		boolean validate = false;
		try {
			validate = CreditCardValidator.validateCreditCard(creditCard.getCardNo(), creditCard.getExpiryDate(), creditCard.getCvvNo());
		} catch (ValidateException e) {
			LOGGER.error(e);
		}
		boolean validate1 = false;
		try {
			validate1 = CreditCardValidator.validateCreditCard(creditCard.getCardNo(), creditCard.getPin());
		} catch (ValidateException e) {
			LOGGER.error(e);
		}
		boolean result=false;
		if(validate || validate1) {
			CreditCardDAO c1=DAOFactory.getCreditCardDAO();
			int ccId=0;
			 ccId = c1.displayCreditCard(creditCard.getCardNo(),creditCard.getExpiryDate(),creditCard.getCvvNo());
			
			if(ccId>0) {
			try(Connection con = ConnectionUtil.getconnection();
			CallableStatement stmt=con.prepareCall("{call trans_procedure1(?,?,?,?,?)}")){
			stmt.setLong(1, creditCard.getCardNo());
			stmt.setFloat(2,amount);
			stmt.setString(3, merchantId);
			stmt.registerOutParameter(4, Types.VARCHAR);
			stmt.registerOutParameter(5, Types.INTEGER);
			stmt.executeUpdate();
			String status=stmt.getString(4);
			Integer transactionId = stmt.getInt(5);
			
			response = new PaymentResponse();
			
				if(status.equals("Transaction Successfull"))
				{
					LOGGER.info("Transaction successful");
					result=true;
					response.setTransactionId(transactionId);
					response.setStatus(result);
				}
				else {
					response.setStatus(false);
				}
			}
			catch(Exception e) {
				LOGGER.error(e);
			}
		}
		}
	
		return response;
	}
	
}