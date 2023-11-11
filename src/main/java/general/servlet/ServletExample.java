package general.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * A servlet in Java is a server-side technology used to extend the capabilities of a server.
 * Unlike a static HTML page that returns the same response every time, a servlet can dynamically
 * generate content in response to client requests.
 * Servlets are the Java counterpart to other dynamic Web content technologies like PHP and ASP.NET.
 */
public class ServletExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}