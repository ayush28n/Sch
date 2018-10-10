<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Edit Contact Details </h3>
					<hr>
					 
					<h3>Details:</h3>  
			<table border='1' cellpadding="4">
				<tr>
					
					<th>Admission No</th>
					<th>Name</th>
					<th>Class</th>
					<th>Mobile No.</th>
				</tr>
			<s:iterator  value="list" status="status">  
				
				<tr>
					
					<td><s:property value="admn"/><br/></td>  
					<td><s:property value="name"/><br/></td>
					<td><s:property value="cls"/><br/>  </td>
					<td><s:property value="mob"/><br/> </td>
				</tr>
 			</s:iterator>
			</table>
			<br>
			<b>Edit Contact Details : </b>
			<br><br>
			<form action="EditContactFinal">
			<s:hidden  value="%{admn}" name="admn" />
			Enter New Mobile No: <input type="number" name="mob">
			<input type="submit" value="Edit Details">
			</form>
			</div>
		</div>
		
<%@include  file="default3.jsp" %>