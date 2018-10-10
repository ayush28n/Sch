<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Change Academic Year </h3>
					
					<hr>
					<form action="CashierChangeYearLogic" method="post">
						<table cellpadding="8">
						<br>
						<tr><th> Are you sure you want to switch to next Academic Year? </th></tr>
						<tr><th> Current Academic Year: <s:property value="CurrentAcademicYear"/> </th></tr>					 
						</table>
						<br>
						<input type="submit" value="Switch To Next Academic Year">
						
					</form>
					
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>