import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class URLFirstWorld extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		out.println("Hello! <a href=http://localhost:8080/WebProj/URLSecondWorld?username="+username+">Click Here</a> to proceed");
	}

}
