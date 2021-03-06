package creditcard;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.time.LocalDate;
import bank.util.ConnectionUtil;
import customer.Customer;
import customer.Register;
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
	
	public static boolean refundAmount(int transactionId,float amount,String comments) {
		boolean result=false;
		try(Connection con = ConnectionUtil.getconnection();
				CallableStatement stmt=con.prepareCall("{call refund_procedure(?,?,?,?)}")){
				stmt.setInt(1, transactionId);
				stmt.setFloat(2,amount);
				stmt.setString(3, comments);
				stmt.registerOutParameter(4, Types.VARCHAR);
				stmt.executeUpdate();
				String status=stmt.getString(4);
					if(status.equals("Amount Refunded"))
					{
						LOGGER.info("Amount successfully refunded");
						result=true;
						LOGGER.debug(result);
				
					}
					else {
						LOGGER.info("Amount refund failed");

					}
				}
				catch(Exception e) {
					LOGGER.error(e);
				}
		

		return result;
	}
	public static boolean login(String email,String password) {
		boolean result=false;
		try(Connection con = ConnectionUtil.getconnection();
				CallableStatement stmt=con.prepareCall("{call login_procedure(?,?,?)}")){
				stmt.setString(1, email);
				stmt.setString(2,password);
				stmt.registerOutParameter(3, Types.VARCHAR);
				stmt.executeUpdate();
				String status=stmt.getString(3);
					if(status.equals("Login Successfull"))
					{
						LOGGER.info("Login Successfull");
						result=true;
						
				
					}
					else {
						LOGGER.info("Login failed");

					}
				}
				catch(Exception e) {
					LOGGER.error(e);
				}
		

		return result;
	}
	public static PaymentResponse pay(CreditCard creditCard,float amount,String merchantId,String comments)  {
		
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
			CallableStatement stmt=con.prepareCall("{call trans_procedure1(?,?,?,?,?,?)}")){
			stmt.setLong(1, creditCard.getCardNo());
			stmt.setFloat(2,amount);
			stmt.setString(3, merchantId);
			stmt.setString(4, comments);
			stmt.registerOutParameter(5, Types.VARCHAR);
			stmt.registerOutParameter(6, Types.INTEGER);
			stmt.executeUpdate();
			String status=stmt.getString(5);
			Integer transactionId = stmt.getInt(6);
			
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
					LOGGER.debug(response);
				}
			}
			catch(Exception e) {
				LOGGER.error(e);
			}
		}
		}
	
		return response;
	}
	public static Register register(Customer c) {
		Register reg=null;
		boolean result=false;
		try(Connection con = ConnectionUtil.getconnection();
				CallableStatement stmt=con.prepareCall("{call register_procedure(?,?,?,?,?,?,?,?,?)}")){
				stmt.setString(1, c.getName());
				stmt.setString(2,c.getStreet());
				stmt.setString(3, c.getCity());
				stmt.setLong(4, c.getMobileNo());
				stmt.setString(5, c.getEmail());
				stmt.setString(6, c.getPassword());
				stmt.setString(7,c.getAccType());
				stmt.registerOutParameter(8, Types.INTEGER);
				stmt.registerOutParameter(9, Types.VARCHAR);
				stmt.executeUpdate();
				String output=stmt.getString(9);
				long accountNo=stmt.getLong(8);
				
				reg = new Register();
				
					if(output.equals("registered"))
					{
						LOGGER.info("Registered Successfully");
						result=true;
						reg.setAccNo(accountNo);
						reg.setStatus(result);
				
					}
					else {
						LOGGER.info("Registration failed");
						reg.setStatus(result);
					}
				}
				catch(Exception e) {
					LOGGER.error(e);
				}
		

		return reg;
	}

	
}