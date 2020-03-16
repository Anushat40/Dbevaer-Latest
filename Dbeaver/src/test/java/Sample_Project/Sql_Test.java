package Sample_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql_Test extends Base_Class{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		String url = "jdbc:sqlserver://164.52.194.143:1433/iHubBusinesstemp";
		String username = "ihubbusinessreaduser";
		String password = "ihubbusinessreaduser";

		Connection con = DriverManager.getConnection(url, username, password);
	}
}
