<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Create New Class </h3>
					<hr><br>
					
					
					<s:iterator value="classes">
  						<div id="managedcontent">
  						 <s:property />
						</div>
  					</s:iterator>
  
				
					<div id="contentform">
					<hr>
					<form action="classentry" method="post">
						<table cellpadding="8">
						<tr>
						<td><b>Select Class:</b></td>
						
						<td><select name="cls">
							<option value="Nursery">Nursery</option>
							<option value="LKG">LKG</option>
							<option value="UKG">UKG</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="Passout">Passout</option>
						</select> </td></tr>
						<tr><td><b>Select Section:</b></td>
						<td><select name="sec">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
							<option value="D">D</option>
							<option value="E">E</option>
							<option value="F">F</option>
							<option value="G">G</option>
							<option value="H">H</option>
							<option value="I">I</option>
							<option value="J">J</option>
						</select> </td></tr>
						</table>
						<input type="submit" value="Submit">
					</form>
					</div>
					
			</div>
		</div>
		
<%@include  file="default3.jsp" %>