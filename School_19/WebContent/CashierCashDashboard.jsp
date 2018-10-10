<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Cashier Dashboard</h3>
					<hr>
						
  					<div id="FeesDescription">
  						<table cellpadding="5" >
  							
  							<tr align="center"><td colspan="2"> <u><i><b>Today Total Cash</b></u></i> </td></tr>
  							<tr>	
  								<td><b>Today Fees Collection: </b></td><td>&#x20b9; <s:property value="TodayFees"/></td>
  							</tr>	
  							<tr>	
  								<td><b>Today Expense: </b></td><td>&#x20b9; <s:property value="TodayExpense"/></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Today Other Income: </b></td><td>&#x20b9; <s:property value="TodayIncome"/>  </b></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Today Cash: </b></td><td>&#x20b9; <s:property value="TodayCash"/>  </b></td>
  							</tr>
  							
						</table>
								
					</div>
					
				<div id="contentdiv" align="center">
			
					
						
  					<div id="FeesDescription">
  						<table cellpadding="5" >
  							
  							<tr align="center"><td colspan="2"> <u><i><b>Month Total Cash</b></u></i> </td></tr>
  							<tr>	
  								<td><b>Fees Collection: </b></td><td>&#x20b9; <s:property value="MonthFees"/></td>
  							</tr>	
  							<tr>	
  								<td><b>Expense: </b></td><td>&#x20b9; <s:property value="MonthExpense"/></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Other Income: </b></td><td>&#x20b9; <s:property value="MonthIncome"/>  </b></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Cash: </b></td><td>&#x20b9; <s:property value="MonthCash"/>  </b></td>
  							</tr>
  							
						</table>
								
					</div>
					
					<div id="FeesDescription">
  						<table cellpadding="5" >
  							
  							<tr align="center"><td colspan="2"> <u><i><b>Cashier Today Cash</b></u></i> </td></tr>
  							<tr>	
  								<td><b> Cashier Today Fees Collection: </b></td><td>&#x20b9; <s:property value="CashierTodayFees"/></td>
  							</tr>	
  							<tr>	
  								<td><b>Cashier Today Expense: </b></td><td>&#x20b9; <s:property value="CashierTodayExpense"/></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Cashier Today Other Income: </b></td><td>&#x20b9; <s:property value="CashierTodayIncome"/>  </b></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Cashier Today Cash: </b></td><td>&#x20b9; <s:property value="CashierTodayCash"/>  </b></td>
  							</tr>
  							
						</table>
								
					</div>
					
					<div id="FeesDescription">
  						<table cellpadding="5" >
  							
  							<tr align="center"><td colspan="2"> <u><i><b>Total Cash</b></u></i> </td></tr>
  							<tr>	
  								<td><b>Fees Collection: </b></td><td>&#x20b9; <s:property value="TotalFees"/></td>
  							</tr>	
  							<tr>	
  								<td><b>Expense: </b></td><td>&#x20b9; <s:property value="TotalExpense"/></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Other Income: </b></td><td>&#x20b9; <s:property value="TotalIncome"/>  </b></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Total Cash: </b></td><td>&#x20b9; <s:property value="TotalCash"/>  </b></td>
  							</tr>
  							
						</table>
								
					</div>
		</div>
		</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>