package mart14;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DBBanka database = new DBBanka("jdbc:sqlite:" + "C:\\Users\\modes\\Desktop\\JDBC_SQLite\\Banka.db");

		Scanner sc = new Scanner(System.in);

		try {
			database.printNazivFilijale();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
