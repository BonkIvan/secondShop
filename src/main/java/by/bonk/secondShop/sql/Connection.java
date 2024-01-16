package by.bonk.secondShop.sql;

import org.postgresql.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Connection {

  private static Connection connection;
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:8888/shop";
    static final String USER = "postgres";
    static final String PASSWORD = "admin";

    static final String URL = "jdbc:postgresql://127.0.0.1:8888/shop?user=postgres&password=admin";

    public Connection() {
        connection = takeConnection();

    }

    public static Connection getConnection() {
        return connection;
    }

    private Connection takeConnection() {
        try {
            DriverManager.registerDriver((Driver)
            Class.forName("org.postgresql.Driver").newInstance());
            System.out.println("get class");
            Connection connection = (Connection) DriverManager.getConnection(URL);

            return connection;




        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isClosed(){
        return connection.isClosed();
    }

    public void close(){
       connection.close();
    }
}
