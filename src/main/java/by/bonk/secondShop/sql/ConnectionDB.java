package by.bonk.secondShop.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public  class ConnectionDB {

    private Connection connection;
    static final String DB_URL = "jdbc:mysql://localhost:3306/shop";
    static final String USER = "root";
    static final String PASSWORD = "root";


    public ConnectionDB (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println(connection.isValid(5));
            this.connection = connection;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public boolean isClosed() throws SQLException {
        return connection.isClosed();
    }


}










   /*

    public void close() {
        connection.close();
    }*/
