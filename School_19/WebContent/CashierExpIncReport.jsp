<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Expense & Income Report </h3>
					<hr>
			<div>
					<form action="CashierExpIncReportPrint" method="post" target="_blank">
						<table cellpadding="8">
						<tr>
						<td><b>From:</b></td>
						<td><input type="date" name="fromdate"><br></td>
  						<td><b>To:</b></td>
						<td><input type="date" name="todate"><br></td>
  						</tr>
						
						</table>
						<br>
						<input type="submit" value="Submit">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>