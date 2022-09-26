import java.sql.*;

public class MySQL {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductDB","root","");
			Statement  stmt =  conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Product");
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString("Name") + " " + rs.getInt(3) + " " + rs.getInt(4));
				
			}
			stmt.close();
			conn.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
