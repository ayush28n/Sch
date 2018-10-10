
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>


		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					
					<br><h3> Print Receipt </h3>
					<hr>
					
					<form action="CashierFeeReceipt" method="post" target="_blank">
						<table>
						<tr><td>Click Here to Get Receipt</td><tr>
						<tr><td><p style="color:red;">****Do Not Click on Refresh Button****<p></td><tr>
						<tr><td><s:submit value="Print Receipt No: %{ReceiptNo}"></s:submit></td></tr>
						</table>
					<s:hidden name="receiptno" value="%{ReceiptNo}" />
					</form>
			
					<br><br><br>
		
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>	