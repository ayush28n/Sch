<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<style>
	#A4
	{
		width: 21cm;
		min-height: 29.7cm;
		float: center;
		//background-color:red;
		box-shadow: 0 0 0.5cm rgba(0,0,0,0.5);
	}
	
	@page 
	{
    size: auto;   /* auto is the initial value */
    margin: 0;  /* this affects the margin in the printer settings */
	}
  }
}
	
	html, body {
    height: 100%;
			}

	html {
    display: table;
    margin: auto;
	}

	body {
    display: table-cell;
    vertical-align: middle;
	}
	table {
    margin: 0 auto; /* or margin: 0 auto 0 auto */
  }
  table { page-break-inside:auto }
    tr    { page-break-inside:avoid; page-break-after:auto }
    thead { display:table-header-group }
    tfoot { display:table-footer-group }
</style>

<html>
	<body>
		<div>
		<div id="A4">
			<br><br>
			<h3 align="center"> Month:   <br><s:property value="monthString"/>, <s:property value="year"/> </h3>
			<h3 align="center"> Due List of Class :  <s:property value="cls"/> </h3>
			<h4 align="center"> List Date:   <s:property value="nowtime"/> </h4> <br/>
			<table border="1" cellpadding="5" width=90%>
			<thead>
        		<tr><td colspan ="11"> <br> </td></tr>
				<tr>
				<tr>
					<th>S.No.</th>
					<th>Adm.</th>
					<th>Name</th>
					<th>Place</th>
					<th>Adm. Fees</th>
					<th>Annual</th>
					<th>Tution</th>
					<th>Tr. Fees</th>
					<th>Other</th>
					<th>Total</th>
					<th>Mob</th>
				</tr>
				</thead>
				
				<tfoot>
           		 <tr><td colspan ="11"> <br></td></tr>
        		</tfoot>
				
				<s:iterator  value="FeeList" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="admn"/><br/></td>  
					
					<td><s:property value="name"/><br/></td>
					<td><s:property value="place"/><br/>  </td>
					<td><s:property value="admission"/><br/>  </td>
					<td><s:property value="annual"/><br/>  </td>
					<td><s:property value="totaltution"/><br/>  </td>
					<td><s:property value="totaltrans"/><br/>  </td>
					<td><s:property value="outstanding"/><br/>  </td>
					<td><s:property value="total"/><br/>  </td>
					<td><s:property value="mob"/><br/>  </td>
				</tr>
				
			
			</s:iterator>
				
			</table>
				<br><br>
				
		</div>
		</div>
	</body>
</html>