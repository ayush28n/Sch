<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Delete a Place </h3>
					<hr><br>
					
					<s:iterator value="place">
  						<div id="managedcontent">
  						 <s:property />
						</div>
  					</s:iterator>
					
					<div id="contentform">
					<hr>
					<form action="placedeleted" method="post">
						<table cellpadding="8">
						<tr> <td><s:select label = "Select Place" list="place"  id="selectedList2" name="place"></s:select></td></tr>
						</table>
						<input type="submit" value="Submit">
					</form>
				
					</div>
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>