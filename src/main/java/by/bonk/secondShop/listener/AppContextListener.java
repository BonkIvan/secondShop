package by.bonk.secondShop.listener;


import by.bonk.secondShop.sql.ConnectionDB;
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
     ConnectionDB connection = new ConnectionDB();
      context.setAttribute("connectionDB", connection.getConnection());

    }



    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionDB connection = (ConnectionDB) sce.getServletContext().getAttribute("connectionDB");
        try {
            if (connection != null && !connection.isClosed()) {
               connection.close();
              }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ServletContextListener.super.contextDestroyed(sce);
    }
    }

