<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Add Income </h3>
					<div border="1">
	
					<form action="CashierIncomeAdded" method="post">
						<table cellpadding="8">
					
						
						<tr> <td><s:select label = "Select Income Type" list="IncomeType"  id="selectedList2" name="IncomeType" value="other 1"></s:select></td></tr>
						
						<tr><td> Enter Description: </td> <td><input type="text" name="description" PLACEHOLDER="Enter Decription Here"><br></td> </tr>
						
						<tr><td> Enter Amount: </td> <td><input type="number" name="amount" PLACEHOLDER="Enter Amount Here"><br></td> </tr>
						</table>
						<input type="submit" value="Add Income">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>