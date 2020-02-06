package beneficiary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import logger.Logger;

public class BeneficiaryDAOImpl implements BeneficiaryDAO {
	private static final Logger LOGGER = Logger.getInstance();

	public void addBeneficiary(Beneficiary beneficiary)  {
		String sql ="insert into beneficiary_list(beneficiary_name,acc_no_1,IFSC_code)values(?,?,?)";
		LOGGER.info(sql);
		try (Connection con = ConnectionUtil.getconnection();PreparedStatement pst = con.prepareStatement(sql)){
			pst.setString(1, beneficiary.getBeneficiaryName());
			pst.setInt(2, beneficiary.getAccNo());
			pst.setString(3, beneficiary.getiFSCCode());
			int rows = pst.executeUpdate();
			LOGGER.info("no of rows inserted:" + rows);
		} catch (Exception e) {
			
			LOGGER.error(e);
		}
}
	public List<Beneficiary> displayBeneficiary() {
		List<Beneficiary> b= new ArrayList<>();

		String sql ="select beneficiary_name,acc_no_1,IFSC_code from beneficiary_list";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement()){
		try(ResultSet rows = stmt.executeQuery(sql)){

		while (rows.next()) {
			String beneficiaryName = rows.getString("beneficiary_name");
			int accNo = rows.getInt("acc_no_1");
			String iFSCCode=rows.getString("IFSC_code");
			LOGGER.getInput(beneficiaryName);
			LOGGER.getInput(accNo);
			LOGGER.getInput(iFSCCode);

			//extracting details from sql
			Beneficiary beneficiary=new Beneficiary();
			b.add(beneficiary);
		}
		}
		}catch(Exception e) {
			LOGGER.error(sql);

		}
		return b;
	}
	public void updateBeneficiary(String beneficiaryName,int accNo) {
		String sql = "update beneficiary_list set beneficiary_name=? where acc_no_1=?";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setString(1, beneficiaryName);
		pst.setInt (2, accNo);

		int rows = pst.executeUpdate();
		LOGGER.info("no of rows updated:"+rows);
		}
		catch(Exception e) {
			LOGGER.error(e);

		}
	}
	public void deleteBeneficiary(int accNo) {
		String sql = "delete from beneficiary_list where acc_no_1=?";
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



}
