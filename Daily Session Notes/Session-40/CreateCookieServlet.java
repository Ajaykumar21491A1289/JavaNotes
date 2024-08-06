import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CreateCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie c1 = new Cookie("username",request.getParameter("username"));
		response.addCookie(c1);
		Cookie c2 = new Cookie("password",request.getParameter("password"));
		response.addCookie(c2);
		out.println("Cookies Created");
	}
}
