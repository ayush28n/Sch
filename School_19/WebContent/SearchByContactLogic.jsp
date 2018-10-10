<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
		
					<br><h3> Student Details </h3>
					<hr>
					 <h3>All Records:</h3>  
			<table border='1' cellpadding="4">
			<tr>
					<th>S.No.</th>
					<th>Admission No</th>
					<th>Name</th>
					<th>Father's Name</th>
					<th>Place</th>
					<th>Class</th>
					<th>Mob</th>
				</tr>
			<s:iterator  value="list" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="admn"/><br/></td>  
					<td><s:property value="name"/><br/></td>
					<td><s:property value="fname"/><br/>  </td>
					<td><s:property value="place"/><br/>  </td>
					<td><s:property value="cls"/><br/>  </td>
					<td><s:property value="mob"/><br/>  </td>
				</tr>
  
			</s:iterator>
			</table>
			</div>
		</div>
		
<%@include  file="default3.jsp" %>