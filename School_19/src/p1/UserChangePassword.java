package p1;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class UserChangePassword 
{
	String UserLoginID;
	HttpSession sesscash = ServletActionContext.getRequest().getSession();
	public String execute()
	{		
		UserLoginID = (String) sesscash.getAttribute("UserLoginID");
		return "success";
	}
	public String getUserLoginID() {
		return UserLoginID;
	}
	public void setUserLoginID(String userLoginID) {
		UserLoginID = userLoginID;
	}
	
	
}

