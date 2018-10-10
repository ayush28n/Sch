<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
					<br><h3> Student Discount </h3>
					<hr>
					 
					<h3>Details:</h3>  
			<form method="post" action="SuperStuDiscFinal">
				<table border='1' cellpadding="4">
					<s:iterator  value="list" status="status">  
							<tr>
								<td>Admission No:</td>
								<td> <s:property value="admn"/> </td>
							</tr>
							
							<tr>
								<td>Name:</td>
								<td> <s:property value="name"/> </td>
							</tr>
							
							<tr>
								<td>Class:</td>
								<td> <s:property value="cls"/> </td>
							</tr>		
								
							<s:hidden  value="%{admn}" name="admn" />

							
								 <s:textfield type="number" label="Tution Fees Discount(%)" name="tutiondisc"  value="%{tutiondisc}"/>
								  <s:textfield type="number" label="Transport Fees Discount(%)" name="transdisc"  value="%{transdisc}"/>
								  
							
									
									<tr align="center">
									<td colspan="2"><input type="submit" value="Discount"></td>
								</tr>	
									
								
  								 
							
 					</s:iterator>
				</table>
			</form>
			
			
			
			</div>
			<br>
			
		</div>
		
<%@include  file="CashDefault2.jsp" %>