import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HttpSessionPage2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		if (username != null)
			out.println("Welcome! "+username);
		else
			//out.println("Invalid Session");
			response.sendRedirect("/WebProj/session.html");
	}
}
