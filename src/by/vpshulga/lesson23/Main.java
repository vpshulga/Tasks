package by.vpshulga.lesson23;

import by.vpshulga.lesson24.db.ConnectorManager;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = ConnectorManager.getConnection();
             Statement statement = connection.createStatement();
        ) {

            String query = "SELECT name, genre, pages_count FROM books";
            ResultSet resultSet = statement.executeQuery(query);

//            while (resultSet.next()){
//                String s = resultSet.getString(1);
//                System.out.println(s);
//            }

            String prepare = "INSERT INTO books (name, pages_count, genre) VALUES(?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(prepare);
            ps.setString(1, "new book");
            ps.setInt(2,222);
            ps.setString(3, "new genre");
            int count = ps.executeUpdate();
            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
