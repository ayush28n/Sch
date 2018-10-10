<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Search Student </h3>
					
					<hr>
					<form action="SearchStudentLogic" method="post">
						<table cellpadding="8">
						<br>
						<tr><th> Select Key Type:</th>
						<td>	<select name="keytype">
  								<option value="adm">Admission No</option>
  								<option value="name">Name</option>
  								<option value="fname">Father's Name</option>
							</select> 
						</td>
							</tr>
						
						<tr><th>Enter Key:</th>
  						<td><input type="varchar" name="key" required="required" placeholder="Enter Key"><br></td>
  						</tr>		 
						</table>
						<input type="submit" value="Submit">
					</form>
					
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>