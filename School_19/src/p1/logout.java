package p1;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class logout
{
	public String execute() 
	{
		HttpSession sess = ServletActionContext.getRequest().getSession();
		sess.removeAttribute( "auth" );
		return "success";
	}
}
