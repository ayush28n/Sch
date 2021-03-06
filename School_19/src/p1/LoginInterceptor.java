package p1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public LoginInterceptor() {
}

public void destroy() {

}

public void init() {

}

public String intercept(ActionInvocation actionInvocation) throws Exception {

    final ActionContext context = actionInvocation.getInvocationContext();
    HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
    HttpSession session = request.getSession();
    //Code

    try {
        String valid= (String) session.getAttribute("auth");
        System.out.println(valid);
        if (valid.equals("ValidUser")) 
        {
        	 actionInvocation.invoke();
        }
        else
        {
        	return "error";
        }

    } 
    
    catch (Exception e) {
        System.out.println(e);
    }
   

    return "ValidationError";
}
}
