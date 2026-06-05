package Lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {
    // අපේ Port එක 3307 නිසා URL එකට 3307 යොදාගන්නවා
    private static final String URL = "jdbc:mysql://localhost:3307/oop_lab_08";
    private static final String USERNAME = "root";
    private static final String PASSWORD = ""; // password එක හිස්ව තබන්න

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}