import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HttpSessionPage1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		out.println("<a href=\"/WebProj/HttpSessionPage2\">Next Page</a>");
	}
}
