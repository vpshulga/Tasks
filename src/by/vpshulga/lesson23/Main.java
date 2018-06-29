package by.vpshulga.lesson23;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = ConnectorManager.getConnection();
             Statement statement = connection.createStatement();
             ) {

            String query = "SELECT name, genre, pages_count FROM books WHERE id = 6";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                String s = resultSet.getString(3);
                System.out.println(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
