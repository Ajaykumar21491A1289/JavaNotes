package com.ejb;
import java.util.Properties;
import javax.naming.*;
public class HelloClient {
	public static void main(String[] args) {
		try
		{
			Properties p = new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
			p.put(Context.PROVIDER_URL, "localhost:1099");
			p.put(Context.URL_PKG_PREFIXES, "org.jboss.naming;org.jnp.interfaces");
			InitialContext ctx= new InitialContext(p);
			HelloBeanRemote rm = (HelloBeanRemote)ctx.lookup("HelloBean/remote");
			String s = rm.sayHello();
			System.out.println(s);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
