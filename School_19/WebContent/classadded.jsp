<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Class Status </h3>
					<hr><br><br><br>
					 <h3>Successfully Added</h3>
					Class: <b><s:property value="fcls"/></b>
			
			</div>
		</div>
		
<%@include  file="default3.jsp" %>