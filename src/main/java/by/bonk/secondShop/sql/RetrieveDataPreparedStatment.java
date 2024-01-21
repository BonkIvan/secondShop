package by.bonk.secondShop.sql;

import by.bonk.secondShop.model.Product;
import by.bonk.secondShop.model.ProductList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDataPreparedStatment {
    private Connection connection;

    public RetrieveDataPreparedStatment(Connection connection) {
        this.connection = connection;
    }

    public ProductList getProduct (){
        ProductList productList = new ProductList();
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                productList.getProducts().add(new Product(rs.getInt("id"),
                                                          rs.getString("name"),
                                                          rs.getString("description"),
                                                          rs.getFloat("price")));
                String strTable = rs.getInt("id") + " - "
                        + rs.getString("name") + " "
                        + rs.getString("description") + " - "
                        + rs.getFloat("price");
                System.out.println(strTable);
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error connection to query " + e.getMessage());
        }

        return productList;
    }

}
//rs.getInt("id"),
//                                              rs.getString("name_product"),rs.getString("description"),
//                        rs.getString("price")