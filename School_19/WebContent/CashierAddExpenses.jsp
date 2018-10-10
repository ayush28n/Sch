<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Add Expense </h3>
					<div border="1">
	
					<form action="CashierExpenseAdded" method="post">
						<table cellpadding="8">
					
						
						<tr> <td><s:select label = "Select Expense Type" list="ExpenseType"  id="selectedList2" name="ExpenseType" value="other1"></s:select></td></tr>
						
						<tr><td> Enter Description: </td> <td><input type="text" name="description" PLACEHOLDER="Enter Decription Here"><br></td> </tr>
						
						<tr><td> Enter Amount: </td> <td><input type="number" name="amount" PLACEHOLDER="Enter Amount Here"><br></td> </tr>
						</table>
						<input type="submit" value="Add Expense">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>