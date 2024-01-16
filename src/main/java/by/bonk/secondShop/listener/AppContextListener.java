package by.bonk.secondShop.listener;

import by.bonk.secondShop.sql.Connection;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.sql.SQLException;

@WebListener("appContextListener")
public class AppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        /* Проинициализировать необходимое:
            Подключение к базе данных
            Первого админа
            Провадера команд
        */
        //Установка соединения с базой данных
      Connection connection = new Connection();
      context.setAttribute("connectionDB", connection);
    }



    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Connection connection = (Connection) sce.getServletContext().getAttribute("connectionDB");
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
        ServletContextListener.super.contextDestroyed(sce);
    }
    }

