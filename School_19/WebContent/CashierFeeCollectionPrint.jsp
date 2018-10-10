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
			<h3 align="center"> Duration ( <s:property value="fromdate"/>   to   <s:property value="todate"/> )</h3>
			<h3 align="center"> Fee Collection Report </h3>
			<table border="1" cellpadding="5" width=90%>
			<thead>
        		<tr><td colspan ="8"> <br> </td></tr>
				<tr>
					<th>S.No.</th>
					<th>Receipt No.</th>
					<th>Adm. No</th>
					<th>Name</th>
					<th>Date</th>
					<th>Amount</th>
					<th>Discount</th>
					<th>Cashier</th>
				</tr>
				</thead>
				
				<tfoot>
           		 <tr><td colspan ="8"> <br></td></tr>
        		</tfoot>
				
				<s:iterator  value="FeeList" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="receiptno"/><br/></td>  
					<td><s:property value="admn"/><br/></td>
					<td><s:property value="name"/><br/>  </td>
					<td><s:property value="date"/><br/>  </td>
					<td><s:property value="total"/><br/>  </td>
					<td><s:property value="discount"/><br/>  </td>
					<td><s:property value="cashier"/><br/>  </td>
				</tr>
				
			
			</s:iterator>
				<tr>
					<td></td>
					<td></td>  
					<td></td>
					<td>  </td>
					<td></td>
					<td> <b>Total</b></td>
					<td> <s:property value="TotalFees"/><br/> </td>
				</tr>
			</table>
				<br><br>
			
		</div>
		</div>
	</body>
</html>