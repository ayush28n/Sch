<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Income Added </h3>
					<hr><br><br><br>
					 <h3>Successfully Added</h3>
					Amount: <b><s:property value="amount"/></b>
			
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>