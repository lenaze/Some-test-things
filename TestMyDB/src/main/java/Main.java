import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "Lena";
    private static final String PASSWORD = "password";


    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement()) {

            if (!connection.isClosed()) {
                System.out.println("Соединение с БД Установлено!");
            }
            connection.close();
            if (connection.isClosed()) {
                System.out.println("Соединение с БД Закрыто!");
            }

            statement.execute("INSERT INTO users (name, age, email) " +
                    "VALUE ('Grace', 27, 'test@gmail.com')");
        }catch (SQLException e) {
            System.err.println(e.getErrorCode());
        }
    }
}
