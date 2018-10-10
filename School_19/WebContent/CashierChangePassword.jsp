<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Change Password </h3>
					<hr>
					
				<div>
					<form action="CashierChangePassFinal" method="post">
						<table>
						<tr><td>Cashier ID: </td> <td><b> <s:property value="#session.CashierID"/> </b></td></tr>
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
		
<%@include  file="CashDefault2.jsp" %>