<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Search Mobile No. </h3>
					
					<hr>
					<form action="SearchByContactLogic" method="post">
						<table cellpadding="8">
						<br>
						
						<tr><th>Enter Mobile No.:</th>
  						<td><input type="varchar" name="mob" required="required" placeholder="Enter Mobile No"><br></td>
  						</tr>		 
						</table>
						<input type="submit" value="Submit">
					</form>
					
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>