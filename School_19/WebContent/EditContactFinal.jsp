<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Contact Update Status </h3>
					<hr><br><br><br>
					 <h3>Successfully Updated</h3>
					Admission No:<b><s:property value="admn"/></b>
					Mobile No:<b><s:property value="mob"/></b>
			</div>
		</div>
		
<%@include  file="default3.jsp" %>