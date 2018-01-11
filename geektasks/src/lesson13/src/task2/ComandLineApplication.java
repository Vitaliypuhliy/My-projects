package lesson13.src.task2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComandLineApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);
        System.out.println("enter the parameters for accessing the database write 1 or use default write any number");
        String host,login,password;
       int i = in.nextInt();
        if (i == 1) {
            host = in.nextLine();
            login = in.nextLine();
            password = in.nextLine();
        }else {
             host = "jdbc:postgresql://localhost:5432/postgres";
             login = "postgres";
             password = "password";
        }
        try {
            Connection conn = DriverManager.getConnection(host, login, password);
            System.out.println("You are connect to db");
            System.out.println("now write your request");
            String  request = inn.nextLine();
            System.out.println(request);
            ResultSet resultSet = conn.createStatement().executeQuery(request);
            RezultSetHandler rezultSetHandler = new RezultSetHandler(resultSet,conn);
            ArrayList<String> arrayList = rezultSetHandler.getNameOfColumns();
            arrayList.forEach(s -> System.out.printf("%10s",s));
            List<String> values = new ArrayList<>();
            int j =1;
            while (resultSet.next()){
                values.add(resultSet.getString(1) + "  "+ resultSet.getString(2) + "  "+
                        resultSet.getString(3) +" "+ resultSet.getString(4) +" "+
                        resultSet.getString(5) +"  "+ resultSet.getString(6) +"  "+resultSet.getString(7));
                j++;
            }
            values.forEach(v -> System.out.println(v));
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
