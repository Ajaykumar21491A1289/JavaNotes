package com.ejb;
import javax.ejb.Stateless;
@Stateless
//Default JNDI name is "HelloBean/remote
//@Stateless(name="xxx") then jndi name will be "xxx/remote"
public class HelloBean implements HelloBeanRemote{
	public String sayHello()
	{
		return "Hello EJB";
	}
}
