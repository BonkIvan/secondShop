package by.bonk.secondShop.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/*@WebFilter("/test")*/
public class LoggingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) resp;



        HttpSession session = httpRequest.getSession(false);

      //  System.out.println(session.getId().toString() + " id session");

        if (session != null ){
        httpRequest.setAttribute("session_id", session.getId());
        filterChain.doFilter(req, resp);

        }
        httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized Access, session null");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
