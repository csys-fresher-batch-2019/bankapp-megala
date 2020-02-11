package transaction;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import logger.Logger;

public class TransactionDAOImpl implements TransactionDAO {
	private static final Logger LOGGER = Logger.getInstance();

	public void addTransaction(Transaction transaction)  {
		try 
			(Connection con = ConnectionUtil.getconnection();
				CallableStatement pst=con.prepareCall("{call fund_transfer_procedure(?,?,?,?,?)}")){

			pst.setInt(1, transaction.getTransactionId());
			pst.setInt(2, transaction.getAccNo());
			pst.setInt(3, transaction.getBeneficiaryAccNo());
			pst.setInt(4, transaction.getTransactionAmount());
			pst.registerOutParameter(5, Types.VARCHAR);
			pst.executeUpdate();
			String status=pst.getString(5);
			LOGGER.debug(status);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}
}
	public List<Transaction> displayTransaction() {
		List<Transaction> t= new ArrayList<>();

		String sql ="select transaction_id,acc_no,beneficiary_acc_no,transaction_date,transaction_amount,status from transaction_details";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement()){
		try(ResultSet rows = stmt.executeQuery(sql)){

		while (rows.next()) {
			String transactionId = rows.getString("transaction_id");
			int accNo=rows.getInt("acc_no");
			int beneficiaryAccNo = rows.getInt("beneficiary_acc_no");
			Timestamp transactionDate=rows.getTimestamp("transaction_date");
			int transactionAmount=rows.getInt("transaction_amount");
			String status=rows.getString("status");
			LOGGER.debug(transactionId);
			LOGGER.debug(accNo);
			LOGGER.debug(beneficiaryAccNo);
			LOGGER.debug(transactionDate);
			LOGGER.debug(transactionAmount);
			LOGGER.debug(status);
			Transaction transaction=new Transaction();
			t.add(transaction);
		}
		}
		} catch (Exception e) {
		
			LOGGER.error(e);
		}
		
		return t;
	}
	public void updateTransaction(int transactionAmount,int beneficiaryAccNo) {
		String sql = "update transaction_details set transaction_amount=? where beneficiary_acc_no=?";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setInt(1, transactionAmount);
		pst.setInt (2, beneficiaryAccNo);

		int rows = pst.executeUpdate();
		LOGGER.info("no of rows updated:"+rows);
	}catch (Exception e) {
		
		LOGGER.error(e);
	}
	}
	public void deleteTransaction(int beneficiaryAccNo){
		String sql = "delete from transaction_details where beneficiary_acc_no=?";
		LOGGER.info(sql);
		
		try 
			(Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setInt(1,beneficiaryAccNo);

			int rows = pst.executeUpdate();
			LOGGER.info("no of rows deleted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}

	}




}
