package creditcardtransaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import logger.Logger;

public class CreditCardTransactionDAOImpl implements CreditCardTransactionDAO {
	private static final Logger LOGGER = Logger.getInstance();

	public int addCreditCardTransaction(CreditCardTransaction creditCardTransaction) {
		String sql = "insert into credit_card_transaction(transaction_id,card_id,amount,description_1,transaction_date,status)values(transaction_id_seq.nextval,?,?,?,?,?)";
		LOGGER.info(sql);
		int rows = 0;
		try 
			(Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setLong(1, creditCardTransaction.getCardId());
			pst.setFloat(2, creditCardTransaction.getAmount());
			pst.setString(3, creditCardTransaction.getMerchantId());
			pst.setTimestamp(4,creditCardTransaction.getTransactionDate());
			pst.setString(5, creditCardTransaction.getStatus());
			rows = pst.executeUpdate();
			LOGGER.info("no of rows inserted:" + rows);
			
		} catch (Exception e) {
			
			LOGGER.error(e);
		}
		
		return rows;

	}

	public List<CreditCardTransaction> displayCreditCardPaymentList() {
		List<CreditCardTransaction> c= new ArrayList<>();

		String sql ="select transaction_id,card_id,amount,description_1,transaction_date,status,created_date from credit_card_transaction";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement()){
		try(ResultSet rows = stmt.executeQuery(sql)){

		while (rows.next()) {
			int transactionId = rows.getInt("transaction_id");
			int cardId = rows.getInt("card_id");
			String description1=rows.getString("description_1");
			Timestamp transactionDate = rows.getTimestamp("transaction_date");
			String status=rows.getString("status");
			Timestamp createdDate=rows.getTimestamp("created_date");
			LOGGER.debug(transactionId);
			LOGGER.debug(cardId);
			LOGGER.debug(description1);
			LOGGER.debug(transactionDate);
			LOGGER.debug(status);
			LOGGER.debug(createdDate);

			
			CreditCardTransaction creditCardTransaction=new CreditCardTransaction();
			creditCardTransaction.setTransactionId(transactionId);
			creditCardTransaction.setCardId(cardId);
			creditCardTransaction.setMerchantId(description1);
			creditCardTransaction.setTransactionDate(transactionDate);
			creditCardTransaction.setStatus(status);
			creditCardTransaction.setCreatedDate(createdDate);
			c.add(creditCardTransaction);
		}
		}
		}catch (Exception e) {
		
			LOGGER.error(e);
		}
		return c;
	}
}
