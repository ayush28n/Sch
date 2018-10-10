<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Add New Cashier </h3>
					<hr>
					
				<div>
					<form action="SuperNewCashierAdded" method="post">
						<table>
						<tr><td><s:textfield label="Name" name="name" placeholder="Enter Cashier Name"/> <br></td></tr>
						<tr><td><s:textfield label="Username" name="username" placeholder="Enter UserName" /> <br></td></tr>
						<tr><td><s:textfield label="Password" name="pass" placeholder="Enter Password" /><br></td></tr>
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