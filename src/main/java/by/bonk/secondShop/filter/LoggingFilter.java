package by.bonk.secondShop.filter;

import by.bonk.secondShop.model.UserShop;
import by.bonk.secondShop.sql.GetUser;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;

/*@WebFilter(urlPatterns = "/dashboard")*/
@WebFilter("/dashboard")
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        resp.setContentType("text/html; charset=UTF-8");
        ServletContext context = req.getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");

        System.out.println("sdfgsdfgds");

        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) resp;

        UserShop user = new GetUser(connection).getUser(httpRequest.getParameter("name"),
                                                        httpRequest.getParameter("password"));

        httpRequest.getSession().setAttribute("role", user.getRole());
        /*HttpSession session = httpRequest.getSession(false);
            session.setAttribute("role", user.getRole());*/
      //  System.out.println(session.getId().toString() + " id session");
        filterChain.doFilter(httpRequest, resp);
      /*  if (session != null ){
        httpRequest.setAttribute("session_id", session.getId());
        filterChain.doFilter(req, resp);

        }
        httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized Access, session null");*/

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
