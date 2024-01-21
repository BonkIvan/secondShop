package by.bonk.secondShop.controller;


import by.bonk.secondShop.model.Product;
import by.bonk.secondShop.sql.ConnectionDB;
import by.bonk.secondShop.sql.RetrieveDataPreparedStatment;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name ="testPage", urlPatterns = "/test")
public class TryPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        Connection connection = (Connection) servletContext.getAttribute("connectionDB");

        RetrieveDataPreparedStatment collection = new RetrieveDataPreparedStatment(connection);
          ArrayList<Product> products = collection.getProduct().getProducts();
        req.setAttribute("productsList", products);
        req.getRequestDispatcher("/WEB-INF/jsp/new.jsp").forward(req, resp);
    }
}
