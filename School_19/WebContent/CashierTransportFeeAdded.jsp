<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Transport Fees Status </h3>
					<hr><br><br><br>
					 <h3>Successfully Updated</h3>
					Place: <b><s:property value="place"/></b>
					Fees: <b><s:property value="trfees"/></b>
			
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>