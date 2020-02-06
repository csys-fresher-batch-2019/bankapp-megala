package bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private ConnectionUtil() {
		throw new IllegalStateException("Utility class");
	}
public static Connection getconnection() throws SQLException{
		
		String server="CSLH2026";
		String userName="system";
		String password="oracle";
		return DriverManager.getConnection("jdbc:oracle:thin:@"+server+":1521:XE", userName, password);
		
}
}
