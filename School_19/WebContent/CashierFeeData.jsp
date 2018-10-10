<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include  file="CashDefault1.jsp" %>

		<div id="centerdiv">
			
			<%@include  file="headerdiv.html" %>
			
			<div id="contentdiv" align="center">
			
					<br><h3> Collect Fees </h3>
					<hr>
			
				<form action="CashierFeeConfirm" method="post">
						
						<table cellpadding="8" >
							<tr>
								<td><b>Adm No.: </b><s:property value="admn"/></td>
								<s:hidden name="admn" value="%{admn}" />
								<td><b>Place:</b> <s:property value="Place"/></td>
									<s:hidden name="Place" value="%{Place}" />
  								<td><b>Class:</b> <s:property value="Cls"/></td>
  									<s:hidden name="Cls" value="%{Cls}" />
							</tr>
  						</table>
  						
  						<table cellpadding="8">
  							<tr>
  								<td colspan="1"><b>Student Name:</b> <s:property value="NameOfStudent"/></td>
  									<s:hidden name="NameOfStudent" value="%{NameOfStudent}" />
  								<td colspan="1"><b>Father's Name:</b> <s:property value="Fname"/></td>
  									<s:hidden name="Fname" value="%{Fname}" />
							</tr>
  						</table>
  						
  					
  						
  					<div id="FeesDescription">
  						<table cellpadding="5" >
  							
  							<tr align="center"><td colspan="2"> <u><i><b>Tution Fees</b></u></i> </td></tr>
  							<tr>	
  								<td><b>From: </b></td><td><s:property value="TutionFromMonthString"/></td>
  								<s:hidden name="duefrom" value="%{duefrom}" />
  								<s:hidden name="transdisc" value="%{transdisc}" />
  								<s:hidden name="tutiondisc" value="%{tutiondisc}" />
  							</tr>	
  							<tr>	
  								<td><b>To: </b></td><td><s:property value="ToMonthString"/></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Tution Fees: </b></td><td><s:property value="TutionFees"/> X <s:property value="TutionMonthBetween"/> = <b><s:property value="TotalTutionFees"/> </b></td>
  							<s:hidden name="TutionFees" value="%{TutionFees}" />
  							</tr>
  							
						</table>
								<b>	<s:select label = "Months" list="TutionMonthList"  name="TutionMonth" value="TutionMonthBetween"> </s:select>	</b>
									
					</div>
					
					<div id="FeesDescription">
  						<table cellpadding="5" >
  							
  							<tr align="center"><td colspan="2"> <b><u><i>Transport Fees</b></u></i> </td></tr>
  							<tr>	
  								<td><b>From: </b></td><td><s:property value="TransFromMonthString"/></td>
  									<s:hidden name="transduefrom" value="%{transduefrom}" />
  							</tr>	
  							<tr>	
  								<td><b>To: </b></td><td><s:property value="ToMonthString"/></td>
  							</tr>
  							
  							<tr>	
  								<td><b>Tr. Fees: </b></td><td><s:property value="TransFees"/> X <s:property value="TransMonthBetween"/> = <b><s:property value="TotalTransFees"/> </b></td>
  							<s:hidden name="TransFees" value="%{TransFees}" />
  							</tr>
  							
						</table>
								<b>	<s:select label = "Months" list="TransMonthList"  name="TransMonth" value="TransMonthBetween"> </s:select>	</b>
									
					</div>
					
					<div id="FeesDescription">
  						<table cellpadding="5">
  							<tr align="center"><td colspan="2"> <b><u><i>Other Fees</b></u></i> </td></tr>
  							
  							<tr>
  								<td><b>Annual Fees: <s:property value="AnnFees"/> </b></td>
  								<td><input type="checkbox" name="CollectAnnual" value="yes" checked="checked"></td>
  								<s:hidden name="AnnFees" value="%{AnnFees}" />
  							</tr>
  							<tr>
  								<td><b>Admission Fees: <s:property value="AdmFees"/></b></td>
  								<td><input type="checkbox" name="CollectAdmission" value="yes" checked="checked"></td>
  								<s:hidden name="AdmFees" value="%{AdmFees}" />
							</tr>
  						</table >
  					</div>
  					
  					
					<div id="FeesDescription">
  						<table cellpadding="8">
  							<tr align="center"><td colspan="2"> <b><u><i>Outstanding</b></u></i> </td></tr>
  							
  								<b>  <s:textfield label ="Amount" type="number"  name="Outstanding" required="required" value="%{Outstanding}"/> </b>
  							
  							
  						</table >
  						<br><br>
  					</div>
  					
  				
  					
  					<div id="FeesDescription">
  						<table cellpadding="8">
  							<tr align="center"><td colspan="2"> <b><u><i>Discount</b></u></i> </td></tr>
  							<tr>
  								<td><b> &#x20b9; <input type="number" step="0.01" name="Discount" value ="0" required="required"></b></td>
							</tr>
  							
  						</table >
  					</div>
  							
						
  					<div id="FeesDescription">
  						<table cellpadding="8">
  							<tr align="center"><td colspan="2"> <b><u><i>Total Amount</b></u></i> </td></tr>
  							<tr>
  								<td><b> &#x20b9; <s:property value="TotalAmount"/></b></td>
							</tr>
  							
  						</table >
  					</div>
						
						
						
						<input type="submit" value="Submit">
				</form>
					<br><br><br>
		
					
			</div>
		</div>
		
<%@include  file="CashDefault2.jsp" %>