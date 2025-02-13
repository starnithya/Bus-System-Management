import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/bus";
	private static final String userName = "root";
	private static final String passWord = "Nithya@0316";
	
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}

}
