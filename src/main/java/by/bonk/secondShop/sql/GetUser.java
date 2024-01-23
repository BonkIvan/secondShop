package by.bonk.secondShop.sql;

import by.bonk.secondShop.model.UserShop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetUser {

    private Connection connection;


    public GetUser(Connection connection) {
        this.connection = connection;
    }


    public UserShop getUser(String name, String password){
        UserShop user = new UserShop();
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE user_name = name ");
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("user_name"));
                user.setEmail(rs.getString("email"));
                user.setRole(rs.getString("user_role"));
                user.setPhone(rs.getString("phone"));

                String userPassword = rs.getString("password_hash");

                String strTable = rs.getString("user_name") + " - "
                        + rs.getString("password_hash");
                System.out.println(strTable + " -- " + userPassword);
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error connection to query " + e.getMessage());
        }
        return user;

    }




}
