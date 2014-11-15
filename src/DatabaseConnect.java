
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnect {

	
	int main(String args[]) {
		
		String DB_URL = "musoni.c4leprqodag9.eu-west-1.rds.amazonaws.com";
		String DB_USER = "student";
		String DB_PASS = "cfg2014!";
		String QUERY = "SELECT * FROM m_client";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(QUERY);
			
			while(rs.next()) {
				System.out.println(rs.getString("account_no"));
			}
		} catch(SQLException e) {
			System.out.println("SQL error " + e.getMessage());
		}
		
		
		
		return 0;
		
	}
}
