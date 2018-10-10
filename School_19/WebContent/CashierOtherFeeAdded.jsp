<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Other Fees Status </h3>
					<hr><br><br><br>
					 <h3>Successfully Updated</h3>
					Fee Type: <b><s:property value="feename"/></b>
					Fees: <b><s:property value="ofees"/></b>
			
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>