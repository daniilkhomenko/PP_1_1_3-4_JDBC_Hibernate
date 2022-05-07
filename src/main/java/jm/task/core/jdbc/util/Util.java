package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    private static Connection conn;

    public static void connect () {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kata_homework1", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    //закрывает общий Connection в Main, чтобы переиспользовать его в DAO, а не открывать и закрывать каждый раз заново
    public static void closeConnection () {
        try {
           conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
