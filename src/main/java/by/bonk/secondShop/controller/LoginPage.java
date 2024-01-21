package by.bonk.secondShop.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;

@WebServlet(urlPatterns = "/login")
public class LoginPage extends HttpServlet {
 /*   @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext servletContext = getServletContext();
    //    Connection connection = (Connection) servletContext.getAttribute("connectionDB");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        req.getRequestDispatcher("/WEB-INF/jsp/sign-up-in-page.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
