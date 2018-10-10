<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Cashier Dashboard</h3>
					<hr><h4> Cashier:  <s:property value="cashier"/></h4>
					<h4> <s:property value="fromdate"/>   --to--   <s:property value="todate"/> </h4>
						
  					<div id="FeesDescription" style="margin-left:165px">
  						<table cellpadding="5" >
  							
  							<tr align="center"><td colspan="2"> <u><i><b>Cashier Collection </b></u></i> </td></tr>
  							<tr>	
  								<td><b>Fees Collection: </b></td><td>&#x20b9; <s:property value="TotalFees"/> ( <s:property value="TotalStudents"/>)</td>
  							</tr>	
  							<tr>	
  								<td><b>Expense: </b></td><td>&#x20b9; <s:property value="TotalExpense"/></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Other Income: </b></td><td>&#x20b9; <s:property value="TotalIncome"/>  </b></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Cash: </b></td><td>&#x20b9; <s:property value="TotalCash"/>  </b></td>
  							</tr>
  							
						</table>
								
					</div>
					
				
		</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>