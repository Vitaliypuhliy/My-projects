package lesson13.src.task1;

import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) {
        try {
            PostgreSQLConnector postgreSQLConnector = new PostgreSQLConnector();
            postgreSQLConnector.conectionToPostgresSQL();
            postgreSQLConnector.createDBIfNoExist();
            TableCreator tableCreator = new TableCreator(postgreSQLConnector.conn);
            tableCreator.createFirstTable();
            GetterTablesContains getterTablesContains = new GetterTablesContains(postgreSQLConnector);
            getterTablesContains.getFieldsFromTable();
            InsertValuesIntoTable insertValuesIntoTable = new InsertValuesIntoTable(postgreSQLConnector);
            insertValuesIntoTable.insertValues();
            insertValuesIntoTable.getInsertValues();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
