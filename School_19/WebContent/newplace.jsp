<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Create New Place </h3>
					<hr><br>
					
					<s:iterator value="village">
  						<div id="managedcontent">
  						 <s:property />
						</div>
  					</s:iterator>
					
					<div id="contentform">
					<hr>
					<form action="placeentry" method="post">
						<table cellpadding="8">
						<tr>
						<td><b>Enter Place Name:</b></td>
						
						
						
						<td> <input type="text" name="vill"><br></td>
						</tr>
						</table>
						<input type="submit" value="Submit">
					</form>
				
					</div>
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>