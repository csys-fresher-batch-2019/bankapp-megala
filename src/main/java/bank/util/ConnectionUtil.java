package bank.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	private ConnectionUtil() {
		throw new IllegalStateException("Utility class");
	}
public static Connection getconnection() throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String server="CSLH2026";
		String userName="system";
		String password="oracle";
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@"+server+":1521:XE", userName, password);
		return connection;
}
}
