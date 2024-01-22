package by.bonk.secondShop.sql;

import by.bonk.secondShop.model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckUsers {

    private Connection connection;

    public CheckUsers(Connection connection) {
        this.connection = connection;
    }


    public boolean checkUser(String name, String password){
        boolean isUser = false;
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT name, password_hash FROM users");
            while (rs.next()) {
                String userName = rs.getString("name");
                String userPassword = rs.getString("password_hash");
                if(userName == name && userPassword == password ){
                    isUser = true;
                    break;
                }
                String strTable = rs.getString("name") + " - "
                        + rs.getString("password_hash");
                System.out.println(strTable);
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error connection to query " + e.getMessage());
        }
        return isUser;

    }

}
