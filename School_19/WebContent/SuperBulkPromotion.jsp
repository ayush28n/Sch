<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Bulk Promotion </h3>
					<hr><br>
					
					
					<s:iterator value="classes">
  						<div id="managedcontent">
  						 <s:property />
						</div>
  					</s:iterator>
  
				
					<div id="contentform">
					<hr>
					<form action="SuperBulkPromotionLogic" method="post">
						<table cellpadding="8">
						
						
						<s:select label = "From" list="classes"  id="selectedList2" name="fromcls"></s:select>
						<s:select label = "To" list="classes"  id="selectedList2" name="tocls"></s:select>
						</table>
						<input type="submit" value="Submit">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>