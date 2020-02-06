package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import logger.Logger;

public class AccountDAOImpl implements AccountDAO {
	
	private static final Logger LOGGER = Logger.getInstance();

	public void addAccount(Account account){
		String sql = "insert into account_details(customer_id,acc_no,acc_type,available_balance)values(?,?,?,?)";
		LOGGER.info(sql);
		try(Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setInt(1, account.getCustomerId());
			pst.setInt(2, account.getAccNo());
			pst.setString(3, account.getAccType());
			pst.setInt(4, account.getAvailableBalance());
			int rows = pst.executeUpdate();
			LOGGER.info("no of rows inserted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}

	}
	
	public List<Account> displayAcc() {
		List<Account> a = new ArrayList<>();

		String sql = "select customer_id,acc_no,acc_type,available_balance from account_details";
		LOGGER.info(sql);
		try(Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement()){
		try(ResultSet rows = stmt.executeQuery(sql)){

		while (rows.next()) {
			int customerId = rows.getInt("customer_id");
			int accNo = rows.getInt("acc_no");
			String accType = rows.getString("acc_type");
			int availableBalance = rows.getInt("available_balance");

			LOGGER.getInput(customerId);
			LOGGER.getInput(accNo);
			LOGGER.getInput(accType);
			LOGGER.getInput(availableBalance);
			
			Account account=new Account();
			a.add(account);
			
		}
		}
		}
		catch(Exception e) {
			LOGGER.error(e);
		}
		return a;
	
	}
	public void updateAccount( int accNo,int id) {
		String sql = "update account_details set acc_no=? where customer_id=?";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setInt(1,accNo );
		pst.setInt(2, id);

		int rows = pst.executeUpdate();
		LOGGER.info("no of rows updated:"+rows);
		}
		catch(Exception e) {
			LOGGER.error(e);
		}
	}
	public void deleteAccount(int accNo) {
		String sql = "delete from account_details where acc_no=?";
		LOGGER.info(sql);
		
		try (
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setInt(1,accNo);

			int rows = pst.executeUpdate();
			LOGGER.info("no of rows deleted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}

	}
	public void searchByAccountNo(int accNo) {
		String sql = "select customer_id,acc_no,acc_type,available_balance from account_details where acc_no=?";
		LOGGER.info(sql);
		try(
		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setInt(1,accNo );
		try(
		ResultSet rows = pst.executeQuery()){
		if (rows.next()) {
			int customerId = rows.getInt("customer_id");
			String accType=rows.getString("acc_type");
			int availableBalance = rows.getInt("available_balance");
			
			LOGGER.getInput(customerId);
			LOGGER.getInput(accType);
			LOGGER.getInput(availableBalance);
			
		}
		}
		}
		catch(Exception e) {
			LOGGER.error(e);
}


	}
	
	public void displayAccount1(int id) {
		String sql = "select acc_no,acc_type,available_balance from account_details where customer_id=?";
		LOGGER.info(sql);
		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setInt(1,id);
		try(ResultSet rows = pst.executeQuery()){
		if (rows.next()) {
			int accNo = rows.getInt("acc_no");
			String accType=rows.getString("acc_type");
			int availableBalance = rows.getInt("available_balance");
			
			LOGGER.getInput(accNo);
			LOGGER.getInput(accType);
			LOGGER.getInput(availableBalance);
		}
		}
		}
		catch(Exception e) {
			LOGGER.error(e);
		}
}
	
	public void displayBalance(int accNo) {
		String sql = "select available_balance from account_details where acc_no=?";
		LOGGER.info(sql);
		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setInt(1,accNo);
		try(ResultSet rows = pst.executeQuery()){
		if (rows.next()) {
			int availableBalance = rows.getInt("available_balance");
			
			LOGGER.getInput(availableBalance);
		}
}
		}
		catch(Exception e) {
			LOGGER.error(e);
		}

}
}