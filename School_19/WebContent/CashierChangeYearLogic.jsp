<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Academic Year Changed </h3>
					
					<hr>
					
						<table cellpadding="8">
						<br>
						<tr><th> Successfully switched to next Academic Year </th></tr>
						<tr><th> Current Academic Year: <s:property value="NewAcademicYear"/> </th></tr>					 
						</table>
						<br>
						
					
					
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>