<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
		
					<h3> Search Receipt </h3>
					<hr>
					 <h4>All Records:</h4>  
			<table border='1' cellpadding="2" width="90%">
				<tr>
					<th>S.No.</th>
					<th>Receipt No</th>
					<th>Name</th>
					<th>Date</th>
					<th>Amount</th>
				</tr>
			<s:iterator  value="list" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="receiptno"/><br/></td>  
					<td><s:property value="name"/><br/></td>
					<td><s:property value="date"/><br/>  </td>
					<td><s:property value="total"/><br/>  </td>
				</tr>
				
				
			</s:iterator>
			<tr>
					<td></td>
					<td></td>  
					<td></td>
					<td><b> Total </b> </td>
					<td><b><s:property value="totaltotal"/><b>  </td>
				</tr>
  
			</table>
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>