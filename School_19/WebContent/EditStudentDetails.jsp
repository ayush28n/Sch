<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Edit Student Details </h3>
					<hr>
			<div>
					<form action="EditStudentConfirm" method="post">
						<table cellpadding="8">
						<tr>
						<td><b>Enter Admission No:</b></td>
						<td><input type="number" name="admn" required="required"><br></td>
  						</tr>
						
						</table>
						<input type="submit" value="Submit">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>