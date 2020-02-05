package creditcardTransaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import creditcard.CreditCard;

public class CreditCardTransactionDAOImpl implements CreditCardTransactionDAO {
	public int addCreditCardTransaction(CreditCardTransaction creditCardTransaction) throws Exception {
		String sql = "insert into credit_card_transaction(transaction_id,card_id,amount,description_1,transaction_date,status)values(transaction_id_seq.nextval,?,?,?,?,?)";
		
		//System.out.println(creditCardTransaction.getMerchantId());
		System.out.println(sql);
		int rows = 0;
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setLong(1, creditCardTransaction.getCardId());
			pst.setFloat(2, creditCardTransaction.getAmount());
			pst.setString(3, creditCardTransaction.getMerchantId());
			pst.setTimestamp(4,creditCardTransaction.getTransactionDate());
			pst.setString(5, creditCardTransaction.getStatus());
			rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;

	}

	public List<CreditCardTransaction> displayCreditCardPaymentList() throws Exception {
		List<CreditCardTransaction> c= new ArrayList<CreditCardTransaction>();

		String sql ="select transaction_id,card_id,amount,description_1,transaction_date,status,created_date from credit_card_transaction";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);

		while (rows.next()) {
			int transactionId = rows.getInt("transaction_id");
			int cardId = rows.getInt("card_id");
			String description1=rows.getString("description_1");
			Timestamp transactionDate = rows.getTimestamp("transaction_date");
			String status=rows.getString("status");
			Timestamp createdDate=rows.getTimestamp("created_date");
			System.out.println(transactionId);
			System.out.println(cardId);
			System.out.println(description1);
			System.out.println(transactionDate);
			System.out.println(status);
			System.out.println(createdDate);

			//extracting details from sql
			CreditCardTransaction creditCardTransaction=new CreditCardTransaction();
			creditCardTransaction.setTransactionId(transactionId);
			creditCardTransaction.setCardId(cardId);
			creditCardTransaction.setMerchantId(description1);
			creditCardTransaction.setTransactionDate(transactionDate);
			creditCardTransaction.setStatus(status);
			creditCardTransaction.setCreatedDate(createdDate);
			c.add(creditCardTransaction);
		}
		return c;
	}
}
