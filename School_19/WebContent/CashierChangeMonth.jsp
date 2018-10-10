<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Change Month </h3>
					
					<hr>
					<form action="CashierChangeMonthLogic" method="post">
						<table cellpadding="8">
						<br>
						<tr><th> Are you sure you want to switch to next month? </th></tr>
						<tr><th> Current Month: <s:property value="CurrentMonth"/> </th></tr>					 
						</table>
						<br>
						<input type="submit" value="Switch To Next Month">
						
					</form>
					
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>