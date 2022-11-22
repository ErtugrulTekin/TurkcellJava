package polymorphismLab;

public class MySqlConnection extends DbConnection{

	public void openConnection() {
		System.out.println("MySql bağlantısı açıldı");
	}
	
	public void closeConnection() {
		System.out.println("MySql bağlantısı kapatıldı");
	}
	
	public void executeQuery(String sql) {
		System.out.println("MySQL komutları çalıştırıldı");
	}
}
