package by.bonk.secondShop.controller;

import by.bonk.secondShop.constant.KeyValues;
import by.bonk.secondShop.sql.CheckUsers;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
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
        resp.setContentType("text/html; charset=UTF-8");
        ServletContext servletContext = getServletContext();

        final String username = req.getParameter(KeyValues.USER_NAME.getParamName());
        final String password = req.getParameter(KeyValues.USER_PASSWORD.getParamName());

        Connection connection = (Connection) servletContext.getAttribute("connectionDB");


        CheckUsers checkUsers = new CheckUsers(connection);

        if (checkUsers.checkUser(username, password)){
            req.getRequestDispatcher("/WEB-INF/jsp/user-page.jsp").forward(req, resp);
            System.out.println(" *****something*****");
        }req.getRequestDispatcher("/WEB-INF/jsp/sign-up-in-page.jsp").forward(req, resp);

    }
}
