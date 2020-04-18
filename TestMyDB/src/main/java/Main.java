import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "Lena";
    private static final String PASSWORD = "password";


    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if (!connection.isClosed()) {
                System.out.println("Соединение с БД Установлено!");
            }
            connection.close();
            if (connection.isClosed()) {
                System.out.println("Соединение с БД Закрыто!");
            }
        }catch (SQLException e) { e.getErrorCode(); }
        finally {
            try {
                connection.close();
            }
            catch (SQLException e) { e.getErrorCode(); }
        }
    }
}
