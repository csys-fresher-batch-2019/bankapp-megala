package loan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;


public class LoanDAOImpl implements LoanDAO {
	public void addLoan(Loan loan) throws Exception {
		String sql = "insert into loan_details(customer_id,branch_name,loan_no,amount,loan_status)values(?,?,?,?,?)";
		System.out.println(sql);
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, loan.customerId);
			pst.setString(2, loan.branchName);
			pst.setString(3, loan.loanNo);
			pst.setInt(4, loan.amount);
			pst.setString(5,loan.status.toString());
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public List<Loan> displayLoan() throws Exception {
		List<Loan> l = new ArrayList<Loan>();

		String sql = "select customer_id,branch_name,loan_no,amount from loan_details";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);
		System.out.println("No of rows displyed:"+rows);

		while (rows.next()) {
			int customerId = rows.getInt("customer_id");
			String name = rows.getString("branch_name");
			String loanNo=rows.getString("loan_no");
			int amount = rows.getInt("amount");

			System.out.println(customerId);
			System.out.println(name);
			System.out.println(loanNo);
			System.out.println(amount);
			
			//extracting details from sql
			Loan loan=new Loan();
			l.add(loan);
		}
		return l;
	}
	public void updateLoan(LoanStatusEnum status, int id) throws Exception {
		String sql = "update loan_details set loan_status=? where customer_id=?";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, status.toString());
		pst.setInt(2, id);

		int rows = pst.executeUpdate();
		System.out.println("no of rows updated:"+rows);
	}
	public void deleteLoan(String loanNo) throws Exception {
		String sql = "delete from loan_details where loan_no=?";
		System.out.println(sql);
		
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,loanNo);

			int rows = pst.executeUpdate();
			System.out.println("no of rows deleted:" + rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}