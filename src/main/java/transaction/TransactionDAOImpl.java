package transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import logger.Logger;

public class TransactionDAOImpl implements TransactionDAO {
	private static final Logger LOGGER = Logger.getInstance();

	public void addTransaction(Transaction transaction)  {
		String sql ="insert into transaction_details(transaction_id,beneficiary_acc_no,transaction_date,transaction_amount)values(?,?,?,?)";
		LOGGER.info(sql);
		try 
			(Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setInt(1, transaction.getTransactionId());
			pst.setInt(2, transaction.getBeneficiaryAccNo());
			pst.setTimestamp(3, Timestamp.valueOf(transaction.getTransactionDate()));
			pst.setInt(4, transaction.getTransactionAmount());
			int rows = pst.executeUpdate();
			LOGGER.info("no of rows inserted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}
}
	public List<Transaction> displayTransaction() {
		List<Transaction> t= new ArrayList<>();

		String sql ="select transaction_id,beneficiary_acc_no,transaction_date,transaction_amount from transaction_details";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement()){
		try(ResultSet rows = stmt.executeQuery(sql)){

		while (rows.next()) {
			String transactionId = rows.getString("transaction_id");
			int beneficiaryAccNo = rows.getInt("beneficiary_acc_no");
			LocalDate transactionDate=rows.getDate("transaction_date").toLocalDate();
			int transactionAmount=rows.getInt("transaction_amount");

			LOGGER.debug(transactionId);
			LOGGER.debug(beneficiaryAccNo);
			LOGGER.debug(transactionDate);
			LOGGER.debug(transactionAmount);
			Transaction transaction=new Transaction();
			t.add(transaction);
		}
		}
		} catch (Exception e) {
		
			LOGGER.error(e);
		}
		
		return t;
	}
	public void updateTransaction(int transactionAmount,int transactionId) {
		String sql = "update transaction_details set transaction_amount=? where transaction_id=?";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setInt(1, transactionAmount);
		pst.setInt (2, transactionId);

		int rows = pst.executeUpdate();
		LOGGER.info("no of rows updated:"+rows);
	}catch (Exception e) {
		
		LOGGER.error(e);
	}
	}
	public void deleteTransaction(int transactionId){
		String sql = "delete from transaction_details where transaction_id=?";
		LOGGER.info(sql);
		
		try 
			(Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setInt(1,transactionId);

			int rows = pst.executeUpdate();
			LOGGER.info("no of rows deleted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}

	}




}
