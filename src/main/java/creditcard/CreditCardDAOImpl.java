package creditcard;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;

public class CreditCardDAOImpl implements CreditCardDAO {
	
	public void addCreditCard(CreditCard creditCard) throws Exception {
		String sql ="insert into credit_card(credit_card_id,credit_card_no,credit_card_pin,acc_no,card_limit,cvv_no,expiry_date,available_balance)values(credit_card_id_seq.nextval,?,?,?,?,?,?,?)";
		System.out.println(sql);
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setLong(1, creditCard.getCardNo());
			pst.setInt(2, creditCard.getPin());
			pst.setInt(3, creditCard.getAccNo());
			pst.setInt(4, creditCard.getLimitNo());
			pst.setInt(5, creditCard.getCvvNo());
			pst.setDate(6, Date.valueOf(creditCard.getExpiryDate()));
			pst.setFloat(7, creditCard.getAvailableBalance());
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public int displayCreditCard(long cardNo,LocalDate expiryDate,int cvvNo) throws ClassNotFoundException {
		String sql ="select credit_card_id from credit_card where credit_card_no=? and expiry_date=? and cvv_no=? ";
		System.out.println(sql);
		int creditCardId = 0;
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setLong(1,cardNo);
			pst.setDate(2,Date.valueOf(expiryDate));
			pst.setInt(3,cvvNo);
			
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				creditCardId = rs.getInt("credit_card_id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return creditCardId;
	}
	public List<CreditCard> displayCreditCards() throws Exception {
		List<CreditCard> c= new ArrayList<CreditCard>();

		String sql ="select credit_card_no,acc_no,limit_no,expiry_date from credit_card";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);

		while (rows.next()) {
			long creditCardNo = rows.getLong("credit_card_no");
			String accNo = rows.getString("acc_no");
			String limitNo=rows.getString("limit_no");
			LocalDate expiryDate = rows.getDate("expiry_date").toLocalDate();
			System.out.println(creditCardNo);
			System.out.println(accNo);
			System.out.println(limitNo);
			System.out.println(expiryDate);

			//extracting details from sql
			CreditCard creditcard=new CreditCard();
			c.add(creditcard);
		}
		return c;
	}
	
	public void deleteCreditCard(String accNo) throws Exception {
		String sql = "delete from credit_card where acc_no=?";
		System.out.println(sql);
		
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,accNo);

			int rows = pst.executeUpdate();
			System.out.println("no of rows deleted:" + rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void updateCreditCard1(String comments,long creditCardNo,boolean blocked) throws Exception{
		
		String sql="update credit_card set comments=?,blocked=? where credit_card_no=?";
		System.out.println(sql);
		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString (1,comments);
		pst.setInt(2, blocked?1:0);
		pst.setLong(3, creditCardNo);
		int rows = pst.executeUpdate();
		System.out.println("no of rows updated:"+rows);

	}

}
