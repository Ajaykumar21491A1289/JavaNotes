import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ReadingCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies)
			out.println(c.getName()+" : "+c.getValue());
	}
}
