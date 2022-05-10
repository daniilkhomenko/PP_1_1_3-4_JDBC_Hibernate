package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    private static final String USER = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/kata_homework1";
    private static final String PASSWORD = "";


    public static Connection connectJDBC() {
        Connection connection = null;

        try {
             connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
