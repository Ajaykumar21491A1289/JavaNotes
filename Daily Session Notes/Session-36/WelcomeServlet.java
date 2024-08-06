import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");//by default the content type is html
		out.println("<html>");
		out.println("<body>");
		out.println("<font face=\"arial\" size=\"7\" color=\"blue\">Welcome to servlets</font>");
		out.println("</body>");
		out.println("</html>");
	
	}
}
