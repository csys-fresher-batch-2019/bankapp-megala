package transaction;

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

public class TransactionDAOImpl implements TransactionDAO {
	public void addTransaction(Transaction transaction) throws Exception {
		String sql ="insert into transaction_details(transaction_id,beneficiary_acc_no,transaction_date,transaction_amount)values(?,?,?,?)";
		System.out.println(sql);
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, transaction.transactionId);
			pst.setInt(2, transaction.beneficiaryAccNo);
			pst.setTimestamp(3, Timestamp.valueOf(transaction.transactionDate));
			pst.setInt(4, transaction.transactionAmount);
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public List<Transaction> displayTransaction() throws Exception {
		List<Transaction> t= new ArrayList<Transaction>();

		String sql ="select transaction_id,beneficiary_acc_no,transaction_date,transaction_amount from transaction_details";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);

		while (rows.next()) {
			String transactionId = rows.getString("transaction_id");
			int beneficiaryAccNo = rows.getInt("beneficiary_acc_no");
			LocalDate transactionDate=rows.getDate("transaction_date").toLocalDate();
			int transactionAmount=rows.getInt("transaction_amount");

			System.out.println(transactionId);
			System.out.println(beneficiaryAccNo);
			System.out.println(transactionDate);
			System.out.println(transactionAmount);

			//extracting details from sql
			Transaction transaction=new Transaction();
			t.add(transaction);
		}
		return t;
	}
	public void updateTransaction(int transactionAmount,int transactionId) throws Exception {
		String sql = "update transaction_details set transaction_amount=? where transaction_id=?";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, transactionAmount);
		pst.setInt (2, transactionId);

		int rows = pst.executeUpdate();
		System.out.println("no of rows updated:"+rows);
	}
	public void deleteTransaction(int transactionId) throws Exception {
		String sql = "delete from transaction_details where transaction_id=?";
		System.out.println(sql);
		
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1,transactionId);

			int rows = pst.executeUpdate();
			System.out.println("no of rows deleted:" + rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




}
