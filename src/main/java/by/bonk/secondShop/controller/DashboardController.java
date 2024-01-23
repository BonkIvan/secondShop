package by.bonk.secondShop.controller;

import by.bonk.secondShop.controller.command.Command;
import by.bonk.secondShop.controller.command.provider.CommandProvider;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DashboardController", urlPatterns = "/dashboard")
public class DashboardController extends HttpServlet {
    private CommandProvider commandProvider;

    @Override
    public void init(ServletConfig config) {
        commandProvider = (CommandProvider) config.getServletContext().getAttribute("commandProvider");

    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String role = (String) req.getSession().getAttribute("role"); // ADMIN
        String page = req.getParameter("page"); // adminOrders
        String method = req.getMethod();

        // логика выбора нужной страницы dashboard-а
        Command command = commandProvider.getCommand(role, page, method);
        command.execute(req, resp);
    }



}
