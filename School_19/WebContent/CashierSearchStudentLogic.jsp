<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
		
					<br><h3> Student Details </h3>
					<hr>
					 <h3>All Records:</h3>  
			<table border='1' cellpadding="4">
			<tr>
					<th>S.No.</th>
					<th>Adm. No</th>
					<th>Name</th>
					<th>Father's Name</th>
					<th>D.O.B</th>
					<th>Place</th>
					<th>Class</th>
					<th>Adm. Date</th>
					<th>Gender</th>
				</tr>
			<s:iterator  value="list" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
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
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>