import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EmpServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String eno = request.getParameter("eno");
		String ename = request.getParameter("ename");
		String sal = request.getParameter("sal");
		out.println("<table border>");
		out.println("<tr><th>Emp Num</th><td>"+eno+"</td></tr>");
		out.println("<tr><th>Emp Name</th><td>"+ename+"</td></tr>");
		out.println("<tr><th>Emp Salary</th><td>"+sal+"</td></tr>");
		out.println("</table>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
