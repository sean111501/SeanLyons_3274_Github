
/**
 * @author Sean Lyons
 * Date: 11/17/2022
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPostgreSQLConnection {
	// private final String url = "jdbc:postgresql://localhost/myDB";
	private final String url = "jdbc:postgresql://localhost:5432/postgres";
	private final String user = "postgres";
	// private final String password = "root";
	private final String password = "SLpunter15";

	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 */
	public Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("Connected to the PostgreSQL server successfully.");
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		JDBCPostgreSQLConnection app = new JDBCPostgreSQLConnection();
		app.connect();
	}
}