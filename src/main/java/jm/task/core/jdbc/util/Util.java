package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/new_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Alexandr120290!";
    private static Connection connection;

    public static Connection getConnection() {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);
//                System.out.println("Connection OK");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        return connection;
    }

}
