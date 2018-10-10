<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
			<br><h3> Fee Due List </h3>
					<hr><br>
				<form action="FeeDueList" method="post" target="_blank">
					<table border="1">

							<s:select label = "Select Class" list="ClassList"  id="selectedList" name="cls" value="defaultClass" required="required"></s:select>
							
							 
							<tr>
								<td>Select <b>Month</b> </td>
								<td><select name="month" required="required">
  									<option value="01">Jan</option>
  									<option value="02">Feb</option>
  									<option value="03">Mar</option>
  									<option value="04">Apr</option>
  									<option value="05">May</option>
  									<option value="06">Jun</option>
  									<option value="07">July</option>
  									<option value="08">Aug</option>
  									<option value="09">Sept</option>
  									<option value="10">Oct</option>
  									<option value="11">Nov</option>
  									<option value="12">Dec</option>
								</select></td>
								<td> <s:select label = "Select Year" list="YearList"  id="selectedList" name="year" value="defaultClass" required="required"></s:select>  </td> 
							</tr>
							<tr>
							
														
							
							<tr align="center">
									<td colspan="2"><input type="submit" value="Submit"></td>
							</tr>
					</table>
				</form>
				
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>













