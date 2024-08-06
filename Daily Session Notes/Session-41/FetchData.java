import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;;
public class FetchData extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try
		{
			ServletContext ctx = getServletContext();
			Connection con = (Connection)ctx.getAttribute("mycon");
			PreparedStatement st = con.prepareStatement("select * from books");
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				out.print("<br>"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			con.close();
		}catch(Exception e)
		{
			out.println(e);
		}
	}
}
