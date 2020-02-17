package bank.util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import logger.Logger;

public class ConnectionUtil {
	private static final  Logger LOGGER = Logger.getInstance();
	private ConnectionUtil() {
		throw new IllegalStateException("Utility class");
	}
public static Connection getconnection() throws Exception{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			LOGGER.error(e);
		}
		String server="CSLH2026";
		String userName="system";
		String password="oracle";
		return DriverManager.getConnection("jdbc:oracle:thin:@"+server+":1521:XE", userName, password);
		
}
public static Jdbi getJdbi() {
	Connection connection = null;
	try {
		connection = ConnectionUtil.getconnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
	Jdbi jdbi = Jdbi.create(connection);
	jdbi.installPlugin(new SqlObjectPlugin());
	return jdbi;
}
}
