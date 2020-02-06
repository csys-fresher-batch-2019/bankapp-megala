package creditcard;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionUtil;
import logger.Logger;

public class CreditCardDAOImpl implements CreditCardDAO {
	private static final Logger LOGGER = Logger.getInstance();

	public void addCreditCard(CreditCard creditCard) {
		String sql ="insert into credit_card(credit_card_id,credit_card_no,credit_card_pin,acc_no,card_limit,cvv_no,expiry_date,available_balance)values(credit_card_id_seq.nextval,?,?,?,?,?,?,?)";
		LOGGER.info(sql);
		try(Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setLong(1, creditCard.getCardNo());
			pst.setInt(2, creditCard.getPin());
			pst.setInt(3, creditCard.getAccNo());
			pst.setInt(4, creditCard.getLimitNo());
			pst.setInt(5, creditCard.getCvvNo());
			pst.setDate(6, Date.valueOf(creditCard.getExpiryDate()));
			pst.setFloat(7, creditCard.getAvailableBalance());
			int rows = pst.executeUpdate();
			LOGGER.info("no of rows inserted:" + rows);
		} catch (Exception e) {
		
			LOGGER.error(e);
		}
}
	public int displayCreditCard(long cardNo,LocalDate expiryDate,int cvvNo) {
		String sql ="select credit_card_id from credit_card where credit_card_no=? and expiry_date=? and cvv_no=? ";
		LOGGER.info(sql);
		int creditCardId = 0;
		try (
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setLong(1,cardNo);
			pst.setDate(2,Date.valueOf(expiryDate));
			pst.setInt(3,cvvNo);
			
			try(ResultSet rs = pst.executeQuery()){
			if (rs.next()) {
				creditCardId = rs.getInt("credit_card_id");
			}
		}
		}catch (Exception e) {
			
			LOGGER.error(e);
		}
		return creditCardId;
	}
	public List<CreditCard> displayCreditCards()  {
		List<CreditCard> c= new ArrayList<>();

		String sql ="select credit_card_no,acc_no,limit_no,expiry_date from credit_card";
		LOGGER.info(sql);

		try(Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement()){
		try(ResultSet rows = stmt.executeQuery(sql)){

		while (rows.next()) {
			long creditCardNo = rows.getLong("credit_card_no");
			String accNo = rows.getString("acc_no");
			String limitNo=rows.getString("limit_no");
			LocalDate expiryDate = rows.getDate("expiry_date").toLocalDate();
			LOGGER.debug(creditCardNo);
			LOGGER.debug(accNo);
			LOGGER.debug(limitNo);
			LOGGER.debug(expiryDate);

			CreditCard creditcard=new CreditCard();
			c.add(creditcard);
		}
		}
		}catch (Exception e) {
		
			LOGGER.error(e);
		}
		return c;
	}
	
	public void deleteCreditCard(String accNo) {
		String sql = "delete from credit_card where acc_no=?";
		LOGGER.info(sql);
		
		try (
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql)){
			pst.setString(1,accNo);

			int rows = pst.executeUpdate();
			LOGGER.info("no of rows deleted:" + rows);
		}catch (Exception e) {
		
			LOGGER.error(e);
		}

	}
	public void updateCreditCard1(String comments,long creditCardNo,boolean blocked) {
		
		String sql="update credit_card set comments=?,blocked=? where credit_card_no=?";
		LOGGER.info(sql);
		try(Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql)){
		pst.setString (1,comments);
		pst.setInt(2, blocked?1:0);
		pst.setLong(3, creditCardNo);
		int rows = pst.executeUpdate();
		LOGGER.info("no of rows updated:"+rows);

	}catch (Exception e) {
		
		LOGGER.error(e);
	}

	}
}
