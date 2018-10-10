<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Set Transport Fees </h3>
					<hr><br>
					
					
					<s:iterator value="feelist">
  						<div id="managedcontent">
  						 <s:property />
						</div>
  					</s:iterator>
  
				
					<div id="contentform">
					<hr>
					<form action="TransportFeeEntry" method="post">
						<table cellpadding="8">
						<tr> <td> <s:select label = "Place" list="places"  id="selectedList2" name="place" required="required"></s:select> </td> </tr>
						
						<tr>
						<td>Enter Fees:</td>
  						<td><input type="number" name="trfees" required="required"><br></td>
  						</tr>		 
						</table>
						<input type="submit" value="Submit">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>