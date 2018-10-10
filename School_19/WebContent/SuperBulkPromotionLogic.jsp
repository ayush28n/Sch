<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Class Promoted </h3>
					<hr><br><br><br>
					<b>
					From: <s:property value="fromcls"/>
					To: <s:property value="tocls"/>
				</b>
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>