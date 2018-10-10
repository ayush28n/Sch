<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Edit Student Details </h3>
					<hr>
					 
					<h3>Details:</h3>  
			<form method="post" action="EditStudentFinal">
				<table border='1' cellpadding="4">
					<s:iterator  value="list" status="status">  
							<tr>
								<td>Admission No:</td>
								<td> <s:property value="admn"/> </td>
							</tr>		
							<s:hidden  value="%{admn}" name="admn" />
							<s:select label="Class"  list="classes"  id="selectedList3" name="cls" value="%{cls}" required="required"></s:select>		
							
							
								 <s:textfield label="Name" name="name"  value="%{name}" required="required"/> 
							
							
								 <s:textfield label="Father's Name" name="fname"  value="%{fname}" required="required"/>
							
								<s:select label="Place"  list="places"  id="selectedList2" name="place" value="%{place}" required="required"></s:select>
							
								 <s:textfield type="number" label="Mobile" name="mob"  value="%{mob}"/>
								  
								  <s:radio label="Gender" name="gender" list="#{'male':'male','female':'female'}" value="%{gender}" />
								  
								  
									<s:textfield label="DOB (Y-M-D)" name="dob"  value="%{dob}" required="required"/>
									
									<tr align="center">
									<td colspan="2"><input type="submit" value="Edit Details"></td>
								</tr>	
									
								
  								 
							
 					</s:iterator>
				</table>
			</form>
			
			
			
			</div>
			<br>
			
		</div>
		
<%@include  file="default3.jsp" %>