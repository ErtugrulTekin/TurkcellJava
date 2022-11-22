package polymorphismLab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		DbConnection connection = (DbConnection) Class.forName(args[0]).newInstance();
		connection.openConnection();
		connection.executeQuery("SELECT * FROM student");
		connection.closeConnection();
		
//		DbConnection connection = new DbConnection();
//		connection.openConnection();
//		connection.executeQuery("SELECT * FROM student");
//		connection.closeConnection();
//		
//		MySqlConnection mySqlConnection = new MySqlConnection();
//		mySqlConnection.openConnection();
//		mySqlConnection.executeQuery("SELECT * FROM student");
//		mySqlConnection.closeConnection();
//		
//		MsSqlConnection msSqlConnection = new MsSqlConnection();
//		msSqlConnection.openConnection();
//		msSqlConnection.executeQuery("SELECT * FROM student");
//		msSqlConnection.closeConnection();

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Database tipi seçiniz [1 (MsSql),2 (MySql),3 (Oracle Sql)]: ");
//		int dbType = scanner.nextInt();
//		DbConnection dbconnection = null;
//		switch (dbType) {
//		case 1:
//			dbconnection = new MsSqlConnection();
//			break;
//		case 2:
//			dbconnection = new MySqlConnection();
//			break;
//		case 3:
//			dbconnection = new OracleDbConnection();
//			break;
//		default:
//			System.out.println("Yanlış veritabanı seçtiniz!");
//			break;
//		}
//		if (dbconnection != null) {
//			dbconnection.openConnection();
//			dbconnection.executeQuery("SELECT * FROM student");
//			dbconnection.closeConnection();
//		}
	}
}
