<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Print Duplicate Receipt </h3>
					<hr>
			<div>
					<form action="CashierPrintDuplicateFinal" method="post" target="_blank">
						<table cellpadding="8">
						<tr>
						<td><b>Enter Receipt No:</b></td>
						<td><input type="number" name="receiptno" required="required"><br></td>
  						</tr>
						
						</table>
						<input type="submit" value="Submit">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>