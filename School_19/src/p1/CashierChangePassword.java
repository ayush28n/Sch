package p1;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class CashierChangePassword 
{
	String CashierLoginID;
	HttpSession sesscash = ServletActionContext.getRequest().getSession();
	public String execute()
	{		
		CashierLoginID = (String) sesscash.getAttribute("CashierID");
		return "success";
	}
	public String getCashierLoginID() {
		return CashierLoginID;
	}
	public void setCashierLoginID(String cashierLoginID) {
		CashierLoginID = cashierLoginID;
	}
	
	
	
}

