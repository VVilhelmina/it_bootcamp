package mart14;

import java.sql.*;

public class DBBanka {

	String connectionString;
		Connection connection;

	public DBBanka(String connectionString) {
		this.connectionString = connectionString;
	}

	public void printNazivFilijale() throws SQLException {

		try (Connection connection = DriverManager.getConnection(connectionString);
				Statement statement = connection.createStatement()) {
			final ResultSet resultSet = statement.executeQuery(
					"SELECT Mesto.Naziv as Mesto,Filijala.Naziv as Filijala FROM Filijala INNER JOIN Mesto ON Mesto.IDMes=Filijala.IDMes");
		
			while (resultSet.next()) {
			String nazivMesta = resultSet.getString(1);
			String nazivFilijale = resultSet.getString(2);
			System.out.println(nazivMesta + ", " + nazivFilijale);
		}

	}
	}
}
