package by.bonk.secondShop.controller.command.implement;

import by.bonk.secondShop.controller.command.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//Описать логику по которой адмим будет работать поле поподания на dasboard
public class AdminOrderCommand implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //создать jsp страницу, гду будет сформирована таблица пльзователей с их заказами
        //Построить логику получения пользователей и их заказов из базы данных

        req.getRequestDispatcher("/WEB-INF/jsp/admin-orders.jsp").forward(req, resp);

    }
}
