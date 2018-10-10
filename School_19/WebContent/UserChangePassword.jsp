<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Change Password </h3>
					<hr>
					
				<div>
					<form action="UserChangePassFinal" method="post">
						<table>
						<tr><td> User ID: </td> <td><b> <s:property value="#session.UserLoginID"/> </b></td></tr>
						<tr><td>Current Password : </td> <td> <input type="password" name="oldpass" required="required" placeholder="Enter Current Password"><br></td></tr>
						<tr><td>New Password : </td> <td> <input type="password" name="newpass" required="required" placeholder="Enter New Password"><br></td></tr>
						</table>
						
					<br>
						<input type="submit" value="Submit">
					</form>
					</div>	
					<br><hr><br>	
									
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>