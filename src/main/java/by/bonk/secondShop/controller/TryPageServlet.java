package by.bonk.secondShop.controller;

import by.bonk.secondShop.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name ="testPage", urlPatterns = "/test")
public class TryPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* Connection connection = new Connection();
        connection.connectionDB();*/
        req.getRequestDispatcher("/WEB-INF/jsp/dashboard-page.jsp").forward(req, resp);
    }
}
