<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Admission Status </h3>
					<hr><br><br><br>
					 <h3>Successfully Admitted</h3>
					Name: <b><s:property value="name"/></b>
						<br>
					Admission No Alloted:<b><s:property value="admn"/></b>
			
			</div>
		</div>
		
<%@include  file="default3.jsp" %>