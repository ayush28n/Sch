<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
		
					<h3> Admission Details </h3>
					<hr>
					 <h4>All Records:</h4>  
			<table border='1' cellpadding="2">
				<tr>
					<th>S.No.</th>
					<th>Adm. No</th>
					<th>Name</th>
					<th>Place</th>
					<th>Class</th>
					<th>Tution Discount %</th>
					<th>Transport Discount %</th>
				</tr>
			<s:iterator  value="list" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="admn"/><br/></td>  
					<td><s:property value="name"/><br/></td>
					<td><s:property value="place"/><br/>  </td>
					<td><s:property value="cls"/><br/>  </td>
					<td><s:property value="tutiondisc"/><br/>  </td>
					<td><s:property value="transdisc"/><br/> </td>
				</tr>
  
			</s:iterator>
			</table>
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>