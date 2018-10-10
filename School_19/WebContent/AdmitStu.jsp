<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="default1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
			<br><h3> New Student Admission </h3>
					<hr><br>
				<form action="admstu" method="post">
					<table border="1">
							<tr>
								<td>Name*:</td>
  								<td><input type="text" name="name" required="required"><br></td>
  							</tr>
							
							<tr>  	
								<td>Father's name*:</td>
  								<td><input type="text" name="fname" required="required"></td>
  							</tr> 
							<tr>
								<td>Gender*:</td>
								<td> <input type="radio" name="gender" value="male" required="required"> Male
  								<input type="radio" name="gender" value="female"> Female</td>
  							</tr>
							<tr>
									<td>  DOB:</td>
  									<td><input type="date" name="dob"placeholder="YYYY-MM-DD" required="required"></td>
  							</tr> 	 
						
							<s:select label = "Place" list="places"  id="selectedList2" name="place" value="defaultPlace" required="required"></s:select> 

							<s:select label = "Class" list="classes"  id="selectedList" name="cls" value="defaultClass" required="required"></s:select>
							
							<tr>  	
								<td>Mobile No:</td>
  								<td><input type="number" name="mobile"></td>
  							</tr>
  							 
							<tr>
								<td>Select <b>Tution</b> Fees Start Month:</td>
								<td><select name="tutionmonth">
  									<option value="4">Apr</option>
  									<option value="5">May</option>
  									<option value="6">Jun</option>
  									<option value="7">July</option>
  									<option value="8">Aug</option>
  									<option value="9">Sept</option>
								</select></td> 
							</tr>
							<tr>
							
							<tr>
								<td>Select <b>Transport</b> Fees Start Month:</td>
								<td><select name="transmonth">
  									<option value="4">Apr</option>
  									<option value="5">May</option>
  									<option value="6">Jun</option>
  									<option value="7">July</option>
  									<option value="8">Aug</option>
  									<option value="9">Sept</option>
								</select></td> 
							</tr>
							
							<tr>
								<td>Collect <b>Admission</b> Fees:</td>
								<td> <input type="radio" name="CollectAdmissionFees" value="yes" required="required" checked="checked"> Yes
  								<input type="radio" name="CollectAdmissionFees" value="no"> No</td>
							</tr>
							
							<tr>
								<td>Collect <b>Annual</b> Fees:</td>
								<td> <input type="radio" name="CollectAnnualFees" value="yes" required="required" checked="checked"> Yes
  								<input type="radio" name="CollectAnnualFees" value="no"> No</td>
							</tr>
							
							
							<tr align="center">
									<td colspan="2"><input type="submit" value="Submit"></td>
							</tr>
					</table>
				</form>
				
			</div>
		</div>
		
<%@include  file="default3.jsp" %>













