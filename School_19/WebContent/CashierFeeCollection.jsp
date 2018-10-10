<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Collect Fees </h3>
					<hr>
			<div>
					<form action="CashierFeeData" method="post">
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
		
<%@include  file="CashDefault2.jsp" %>