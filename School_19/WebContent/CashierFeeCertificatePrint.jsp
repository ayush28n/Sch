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
			<div style="text-align:center">
			<font size="6"> <b> Happy Public School </b></font><br>
			<font size="2"> Chauroli Road, Jewar</font>
			</div>
			<hr size="4" style="background-color: black;" >
			<br>
			<h3 align="center"> Fee Collection Certificate </h3>
			<h3 align="center"> Duration ( <s:property value="fromdate"/>   to   <s:property value="todate"/> )</h3>
			<hr width="65%" style="border-top: dotted 1px;"/>
			<table cellpadding ="5">
			<tr><td> <b> Admission No: </b> </td> <td> <b><s:property value="admn"/></b></td></tr>
				<tr><td> <b> Student Name:</b> </td> <td><b> <s:property value="name"/></b> </td></tr>
				<tr><td> <b> Father's Name:</b> </td> <td><b> <s:property value="fname"/></b> </td></tr>
			</table>
			<br><br>
			<table border="1" cellpadding="5" width=90%>
			<thead>
        		
				<tr>
					<th>S.No.</th>
					<th>Receipt No.</th>
					<th>Date</th>
					<th>Amount</th>
				</tr>
				</thead>
				
				<tfoot>
           		
        		</tfoot>
 
				<s:iterator  value="FeeList" status="status">  
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="receiptno"/><br/></td>  
					
					<td><s:property value="date"/><br/>  </td>
					<td><s:property value="total"/><br/>  </td>
				</tr>
				
			
			</s:iterator>
				<tr>  
					<td></td>
					<td>  </td>
					<td> <b>Total</b></td>
					<td> <b> <s:property value="TotalFees"/><br/> </b> </td>
				</tr>
			</table>
				<br><br><br><br>
				<div style="text-align:right;padding:20px;margin-right:80px"><p> Signature of Authority </p></div>
			
		</div>
		</div>
	</body>
</html>