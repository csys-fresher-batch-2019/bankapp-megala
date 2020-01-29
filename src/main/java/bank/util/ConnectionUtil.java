package bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
public static Connection getconnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String server="CSLH2026";
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@"+server+":1521:XE", "system", "oracle");
		System.out.println("connection");
		return connection;
}
}
