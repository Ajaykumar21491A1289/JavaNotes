import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class LogFilter implements Filter {
    public void destroy() {
	
	}
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			String ipAddress = request.getRemoteAddr();
			System.out.println("IP Address:"+ipAddress+", Time:"+new Date().toString());
			chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
