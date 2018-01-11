package lesson13.src.task1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GetterTablesContains {
    private PostgreSQLConnector postgreSQLConnector;

    public GetterTablesContains(PostgreSQLConnector postgreSQLConnector) {
        this.postgreSQLConnector = postgreSQLConnector;
    }
    public void getFieldsFromTable() throws SQLException {
        Statement statement = postgreSQLConnector.conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select column_name,data_type from information_schema.columns " +
                "where table_name = 'test'; ");
        ArrayList<String> arrayList = new ArrayList<>();
        while (resultSet.next()){
            arrayList.add(resultSet.getString(1));
        }
        resultSet.close();
        System.out.println(arrayList.isEmpty());
        arrayList.forEach(m -> System.out.println(m));

    }
}
