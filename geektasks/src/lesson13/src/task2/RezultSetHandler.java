package lesson13.src.task2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RezultSetHandler {
    private ResultSet resultSet;
    private Connection connection;

    public RezultSetHandler(ResultSet resultSet,Connection connection) {
        this.resultSet = resultSet;
        this.connection = connection;
    }

    public ArrayList<String> getNameOfColumns() throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet rset = metaData.getColumns(null, null, "test", null);
        while (rset.next())
        {
            list.add(rset.getString(4));
        }
        return list;
    }
}
