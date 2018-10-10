<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Delete a User </h3>
					<hr>
					
				<div>
					<form action="SuperRemoveUserDeleted" method="post">
						<table>
						<tr> <td><s:select label = "Select Username" list="usernames"  name="username"></s:select></td></tr>
						</table>
						
					<br>
						<input type="submit" value="Submit">
					</form>
					</div>	
					<br><hr><br>	
					<div>
						<table border="1" width="80%">
							<tr>
								<th>S.No.</th>
								<th>Name</th>
								<th>Username</th>
							</tr>
					
  						
  						<s:iterator value="users" status="status">	
  							<tr>
  						 		<td> <s:property value="%{#status.count}" /> </td>
  						  		<td> <s:property value="name" /> </td>
  						  		<td> <s:property value="username" /> </td>
  						 	</tr>
  						
						
  						</s:iterator>
 						</table>
					</div>
					
				
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>