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
			<h3 align="center"> Expense Report </h3>
			<table border="1" cellpadding="5" width=90%>
				<thead>
				<tr>
					<th>S.No.</th>
					<th>Date</th>
					<th>Time</th>
					<th>Type</th>
					<th>Description</th>
					<th>Amount</th>
					<th>Cashier</th>
				</tr>
				</thead>
				<s:iterator  value="ExpenseList" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="date"/><br/></td>  
					<td><s:property value="time"/><br/></td>
					<td><s:property value="type"/><br/>  </td>
					<td><s:property value="desc"/><br/>  </td>
					<td><s:property value="amount"/><br/>  </td>
					<td><s:property value="cashier"/><br/>  </td>
				</tr>
				
			
			</s:iterator>
				<tr>
					<td></td>
					<td></td>  
					<td></td>
					<td>  </td>
					<td> </td>
					<td> <b>Total</b></td>
					<td> <b> <s:property value="TotalExpense"/> </b> <br/> </td>
				</tr>
			</table>
			<br>
			<table cellpadding="2" border="1">
				<thead>
				<tr>
				<td colspan="2" align="center"> <b>Expense Summary </b></td>
				</tr>
				</thead>
				<tr>
					<td><b>Building:</b> </td><td><b><s:property value="buildingexp"/></b></td>
				</tr>
				<tr>
					<td><b>Stationary:</b> </td><td><b><s:property value="stationaryexp"/></b></td>
				</tr>
				<tr>
					<td><b>Fuel:</b> </td><td><b><s:property value="fuelexp"/></b></td>
				</tr>
				<tr>
					<td><b>Furniture:</b> </td><td><b><s:property value="furnitureexp"/></b></td>
				</tr>
				
				<tr>
					<td><b>PP:</b> </td><td><b><s:property value="ppexp"/></b></td>
				</tr>
				<tr>
					<td><b>Salary:</b> </td><td><b><s:property value="salexp"/></b></td>
				</tr>
				<tr>
					<td><b>Transport Maintenance:</b> </td><td><b><s:property value="transexp"/></b></td>
				</tr>
				
				<tr>
					<td><b>Other1:</b> </td><td><b><s:property value="other1exp"/></b></td>
				</tr>
				<tr>
					<td><b>Other2:</b> </td><td><b><s:property value="other2exp"/></b></td>
				</tr>
				<tr>
					<td></td>><td> <b><s:property value="TotalExpense"/></b><br/> </td>
				</tr>
			</table>
				<br><br>
				<h3 align="center"> Income Report </h3>
				<table border="1" cellpadding="5" width=90%>
				<thead>
				<tr>
					<th>S.No.</th>
					<th>Date</th>
					<th>Time</th>
					<th>Type</th>
					<th>Description</th>
					<th>Amount</th>
					<th>Cashier</th>
				</tr>
				</thead>
				<s:iterator  value="IncomeList" status="status">  
				
				<tr>
					<td><s:property value="%{#status.count}" /> <br /></td>
					<td><s:property value="date"/><br/></td>  
					<td><s:property value="time"/><br/></td>
					<td><s:property value="type"/><br/>  </td>
					<td><s:property value="desc"/><br/>  </td>
					<td><s:property value="amount"/><br/>  </td>
					<td><s:property value="cashier"/><br/>  </td>
				</tr>
			</s:iterator>
			<tr>
					<td></td>
					<td></td>  
					<td></td>
					<td>  </td>
					<td> </td>
					<td> <b>Total</b></td>
					<td> <b> <s:property value="TotalIncome"/> </b><br/>  </td>
				</tr>
			</table>
			<br>
			<table cellpadding="2" border="1">
				<thead>
				<tr>
				<td colspan="2" align="center"> <b>Income Summary </b></td>
				</tr>
				</thead>
				<tr>
					<td><b>Debt Recovery:</b> </td><td><b><s:property value="debtinc"/></b></td>
				</tr>
				
				<tr>
					<td><b>Other 1:</b> </td><td><b><s:property value="other1inc"/></b></td>
				</tr>
				<tr>
					<td><b>Other 2:</b> </td><td><b><s:property value="other2inc"/></b></td>
				</tr>
				
				<tr>
					<td></td><td> <b><s:property value="TotalIncome"/></b><br/> </td>
				</tr>
				
			</table>
			<br><br><br><br>
		</div>
		</div>
	</body>
</html>