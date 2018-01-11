package lesson13.src.task1;

import java.sql.*;
import java.util.ArrayList;

public class PostgreSQLConnector {
    private String userName = "postgres";
    private String password = "password";
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    Connection conn = null;

    public PostgreSQLConnector(String userName, String password, String url) {
        this.userName = userName;
        this.password = password;
        this.url = url;
    }

    public PostgreSQLConnector() {

    }

    public Connection conectionToPostgresSQL(){

        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public boolean createDBIfNoExist() throws SQLException {
        Statement statement = conn.createStatement();
        ArrayList<String> arrayList = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT datname FROM pg_database ");
        while (resultSet.next()) {
            arrayList.add(resultSet.getString(1));
        }
        if (arrayList.contains("pukhlii")) {
            System.out.println("data base pukhlii exist");
        } else {
            statement.executeQuery("CREATE DATABASE pukhlii;");
        }
        return true;
    }
}
