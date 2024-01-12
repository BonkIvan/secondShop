package by.bonk.secondShop.controller.command;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Command {
    //Метод который будет возвра
   void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
