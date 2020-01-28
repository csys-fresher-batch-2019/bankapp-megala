package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;

public class AccountDAOImpl implements AccountDAO {
	
	public void addAccount(Account account) throws Exception {
		String sql = "insert into account_details(customer_id,acc_no,acc_type,available_balance)values(?,?,?,?)";
		System.out.println(sql);
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, account.customerId);
			pst.setInt(2, account.accNo);
			pst.setString(3, account.accType);
			pst.setInt(4, account.availableBalance);
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Account> displayAcc() throws Exception {
		List<Account> a = new ArrayList<Account>();

		String sql = "select customer_id,acc_no,acc_type,available_balance from account_details";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);
		System.out.println("No of rows displyed:"+rows);

		while (rows.next()) {
			int customerId = rows.getInt("customer_id");
			int accNo = rows.getInt("acc_no");
			String accType = rows.getString("acc_type");
			int availableBalance = rows.getInt("available_balance");

			System.out.println(customerId);
			System.out.println(accNo);
			System.out.println(accType);
			System.out.println(availableBalance);
			//extracting details from sql
			Account account=new Account();
			a.add(account);
		}
		return a;
	}
	public void updateAccount( int accNo,int Id) throws Exception {
		String sql = "update account_details set acc_no=? where customer_id=?";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1,accNo );
		pst.setInt(2, Id);

		int rows = pst.executeUpdate();
		System.out.println("no of rows updated:"+rows);
	}
	public void deleteAccount(int accNo) throws Exception {
		String sql = "delete from account_details where acc_no=?";
		System.out.println(sql);
		
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1,accNo);

			int rows = pst.executeUpdate();
			System.out.println("no of rows deleted:" + rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void searchByAccountNo(int accNo) throws Exception{
		String sql = "select customer_id,acc_no,acc_type,available_balance from account_details where acc_no=?";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1,accNo );
		ResultSet rows = pst.executeQuery();
		System.out.println("No of rows displyed:"+rows);
		if (rows.next()) {
			int customerId = rows.getInt("customer_id");
			String accType=rows.getString("acc_type");
			int availableBalance = rows.getInt("available_balance");
			
			System.out.println(customerId);
			System.out.println(accType);
			System.out.println(availableBalance);
			
		}



	}
	
	public void displayAccount1(int id) throws Exception{
		String sql = "select acc_no,acc_type,available_balance from account_details where customer_id=?";
		System.out.println(sql);
		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1,id);
		ResultSet rows = pst.executeQuery();
		System.out.println("No of rows displyed:"+rows);
		if (rows.next()) {
			int accNo = rows.getInt("acc_no");
			String accType=rows.getString("acc_type");
			int availableBalance = rows.getInt("available_balance");
			
			System.out.println(accNo);
			System.out.println(accType);
			System.out.println(availableBalance);
		}
}
	
	public void displayBalance(int accNo) throws Exception{
		String sql = "select available_balance from account_details where acc_no=?";
		System.out.println(sql);
		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1,accNo);
		ResultSet rows = pst.executeQuery();
		System.out.println("No of rows displyed:"+rows);
		if (rows.next()) {
			int availableBalance = rows.getInt("available_balance");
			
			System.out.println(availableBalance);
		}
}
	}

