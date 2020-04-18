import java.sql.*;
import java.util.TimeZone;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";//db?serverTimezone=" + TimeZone.getDefault().getID();
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";


    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement()) {

            if (!connection.isClosed()) {
                System.out.println("Соединение с БД Установлено!");
            }

            statement.execute("INSERT INTO users (name, age, email) " +
                    "VALUE ('Grace', 27, 'test@gmail.com')");

            statement.executeQuery("SELECT * from users");

            statement.addBatch("INSERT INTO users (name, age) value ('new name1', 22)");
            statement.addBatch("INSERT INTO users (name, age) value ('new name2', 4)");
            statement.addBatch("INSERT INTO users (name, age) value ('new name3', 12)");

            statement.executeBatch();

        }catch (SQLException e) {
        }
    }
}
