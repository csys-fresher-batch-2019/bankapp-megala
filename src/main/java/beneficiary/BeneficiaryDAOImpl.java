package beneficiary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.ConnectionUtil;

public class BeneficiaryDAOImpl implements BeneficiaryDAO {
	public void addBeneficiary(Beneficiary beneficiary) throws Exception {
		String sql ="insert into beneficiary_list(beneficiary_name,acc_no_1,IFSC_code)values(?,?,?)";
		System.out.println(sql);
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, beneficiary.beneficiaryName);
			pst.setInt(2, beneficiary.accNo);
			pst.setString(3, beneficiary.iFSCCode);
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public List<Beneficiary> displayBeneficiary() throws Exception {
		List<Beneficiary> b= new ArrayList<Beneficiary>();

		String sql ="select beneficiary_name,acc_no_1,IFSC_code from beneficiary_list";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);

		while (rows.next()) {
			String beneficiaryName = rows.getString("beneficiary_name");
			int accNo = rows.getInt("acc_no_1");
			String iFSCCode=rows.getString("IFSC_code");
			System.out.println(beneficiaryName);
			System.out.println(accNo);
			System.out.println(iFSCCode);

			//extracting details from sql
			Beneficiary beneficiary=new Beneficiary();
			b.add(beneficiary);
		}
		return b;
	}
	public void updateBeneficiary(String beneficiaryName,int accNo) throws Exception {
		String sql = "update beneficiary_list set beneficiary_name=? where acc_no_1=?";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, beneficiaryName);
		pst.setInt (2, accNo);

		int rows = pst.executeUpdate();
		System.out.println("no of rows updated:"+rows);
	}
	public void deleteBeneficiary(int accNo) throws Exception {
		String sql = "delete from beneficiary_list where acc_no_1=?";
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



}
