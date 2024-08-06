import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class CardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Enumeration<String> e = request.getParameterNames();
		out.println("<table border>");
		while(e.hasMoreElements())
		{
			String fname = e.nextElement();
			String[] values = request.getParameterValues(fname);
			out.println("<tr>");
			out.println("<th>"+fname+"</th>");
			out.println("<td>");
			out.println("<ul>");
			for(String val : values)
			{
				out.println("<li>"+val+"</li>");
			}
			out.println("</ul>");
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}
}
