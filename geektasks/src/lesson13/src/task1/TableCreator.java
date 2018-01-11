package lesson13.src.task1;

import java.sql.*;
import java.util.ArrayList;

public class TableCreator {
    Connection connection;

    public TableCreator(Connection connection) {
        this.connection = connection;
    }
    public void createFirstTable() throws SQLException {
        DatabaseMetaData md = connection.getMetaData();
        Statement statement = connection.createStatement();
        dropTableIfExist(md, statement);
        String sqlCreate = "CREATE TABLE " + "test"
                + "  (brand           VARCHAR(10),"
                + "   year            INTEGER,"
                + "   number          INTEGER,"
                + "   value           INTEGER,"
                + "   card_count      INTEGER,"
                + "   player_name     VARCHAR(50),"
                + "   player_position VARCHAR(20))";


        statement.execute(sqlCreate);
        System.out.println("table create !!!");

    }

    private void dropTableIfExist(DatabaseMetaData md, Statement statement) throws SQLException {
        ArrayList<String> listTables = getTablesName(md);
        if (listTables.contains("test")){
            statement.execute("DROP TABLE test;");
            System.out.println("table create!");
        }else {
            System.out.println("table test dont exist");
        }
    }

    private ArrayList<String> getTablesName(DatabaseMetaData md) throws SQLException {
        ArrayList<String> listTables = new ArrayList();
        ResultSet rs = md.getTables(null, null, "%", null);
        while (rs.next()) {
            listTables.add(rs.getString(3));
        }
        return listTables;
    }
}
