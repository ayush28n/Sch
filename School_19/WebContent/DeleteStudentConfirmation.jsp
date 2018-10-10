<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Delete Confirmation </h3>
					<hr>
					 
				<h3>Are you SURE you want to delete this Student?</h3>
					<h3>Details:</h3>  
			<table border='1' cellpadding="4">
				<tr>
					
					<th>Admission No</th>
					<th>Name</th>
					<th>Father's Name</th>
					<th>D.O.B </th>
					<th>Place</th>
					<th>Class</th>
					<th>Admission Date</th>
					<th>Gender</th>
				</tr>
			<s:iterator  value="list" status="status">  
				
				<tr>
					
					<td><s:property value="admn"/><br/></td>  
					<td><s:property value="name"/><br/></td>
					<td><s:property value="fname"/><br/>  </td>
					<td><s:property value="dob"/><br/> </td>
					<td><s:property value="place"/><br/>  </td>
					<td><s:property value="cls"/><br/>  </td>
					<td><s:property value="dor"/><br/>  </td>
					<td><s:property value="gender"/><br/> </td>
				</tr>
  
			</s:iterator>
			</table>
			<br>
			<b>Click Delete if you are SURE : </b>
			<br><br>
			<form action="DeleteStudentFinal">
			<s:hidden  value="%{admn}" name="admn" />
			<input type="submit" value="Delete Record">
			</form>
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>