import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletConfigDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		out.println("username :"+username);
		out.println("password :"+password);
	}
}
/*
web.xml
------
<web-app>
	<servlet>
		<servlet-name>ServletConfigDemo</servlet-name>
		<servlet-class>ServletConfigDemo</servlet-class>
		<init-param>
			<param-name>username</param-name>
			<param-value>scott</param-value>
		</init-param>
		<init-param>
			<param-name>password</param-name>
			<param-value>tiger</param-value>
		</init-param>
	</servlet>
</web-app>
*/