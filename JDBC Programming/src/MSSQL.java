import java.sql.*;

public class MSSQL {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:microsoft:sqlserver://hostname:1433;ProductDB");
			Statement  stmt =  conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Product");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
