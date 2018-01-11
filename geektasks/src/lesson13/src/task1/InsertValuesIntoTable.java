package lesson13.src.task1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValuesIntoTable {
    private PostgreSQLConnector postgreSQLConnector;
    Statement statement = null;

    public InsertValuesIntoTable(PostgreSQLConnector postgreSQLConnector) {
        this.postgreSQLConnector = postgreSQLConnector;
        try {
            statement =postgreSQLConnector.conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertValues() throws SQLException {
        Statement statement =postgreSQLConnector.conn.createStatement();
        statement.execute("INSERT INTO test(brand , year ,number , value ,card_count ,player_name ,player_position)" +
                "VALUES ('u', 1990,5,20,4,'Vitaliy','Pukhlii');");
        statement.execute("INSERT INTO test(brand , year ,number , value ,card_count ,player_name ,player_position)" +
                "VALUES ('u', 1991,5,20,4,'Vitaliy','Pukhlii');");
        statement.execute("INSERT INTO test(brand , year ,number , value ,card_count ,player_name ,player_position)" +
                "VALUES ('u', 1992,5,20,4,'Vitaliy','Pukhlii');");
    }
    public void getInsertValues() throws SQLException {
        ResultSet result = statement.executeQuery("SELECT * FROM test");
        int i =1;
        while (result.next()){
            System.out.println(result.getString(i));
            i++;
        }
    }
}
