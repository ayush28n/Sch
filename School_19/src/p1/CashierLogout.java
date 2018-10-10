package p1;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class CashierLogout
{
	public String execute() 
	{
		System.out.println("cashier logged out");
		HttpSession sesscash = ServletActionContext.getRequest().getSession();
		sesscash.removeAttribute( "cashauth" );
		sesscash.removeAttribute( "cashrole" );
		return "success";
	}
}
