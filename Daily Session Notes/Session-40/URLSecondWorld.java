import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class URLSecondWorld extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		if (username != null)
			out.println("Hello "+username);
		else
			out.println("Invalid Session");
	}
}
