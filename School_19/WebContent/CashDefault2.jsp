<div id="rightdiv">
					<div id="logoutdiv">
						<div align="center">
							<p align="center"><b>Current Academic Year: <br><s:property value="#session.AcademicYear"/></b></p>
							<p align="center"><b>Current Month & Year :<br> <s:property value="#session.MonthYear"/></b></p>
							<a href="CashierLogout"> Logout </a>
						</div>
					</div>
					
					<div id="rightlink">
						
						
						
						<table align="center" border="1" width="100%">
							<tr>
								<td id="linktitle"> Reports </td>
							</tr>
							
							<tr align="center">
								<td><a href="FeeDueListTrigger"> Class Wise Fee Due Report</a>
							</tr>
							
							<tr align="center">
								<td><a href="FeeDueListTriggerPlaceWise"> Place Wise Fee Due Report</a>
							</tr>
							
							<tr align="center">
								<td><a href="FeeDueListTriggerSchoolWise"> School Wise Fee Due Report</a>
							</tr>
							
							<tr align="center">
								<td><a href="CashierExpIncReport"> Expense & Income Report</a>
							</tr>
							
							<tr align="center">
								<td><a href="CashierFeeCollectionReport"> Fee Collection Report</a>
							</tr>
							
							<tr align="center">
								<td><a href="CashierFeeCertificate"> Fee Collection Certificate</a>
							</tr>
							
							<tr align="center">
								<td><a href="CashierAdmissionReport"> Admission Report </a>
							</tr>
						
						</table><br>
						
						
						<table align="center" border="1" width="100%">
							<tr>
								<td id="linktitle"> Accounts </td>
							</tr>
							<tr align="center">
								<td><a href="CashierAddExpenses"> Expense Entry</a>
							</tr>
							<tr align="center">
								<td><a href="CashierAddIncome"> Income Entry</a>
							</tr>
						</table><br>
				
						
						<table align="center" border="1" width="100%">
							<tr>
								<td id="linktitle"> Set Fees </td>
							</tr>
							<tr align="center">
								<td><a href="Cashiersettutionfee"> Set Tution Fees</a>
							</tr>
							<tr align="center">
								<td><a href="CashierSetTransportFee"> Set Transport Fees</a>
							</tr>
							<tr align="center">
								<td><a href="CashierSetOtherFee"> Set Other Fees</a>
							</tr>
				
						</table>
						<br>	
						
						<s:if test="%{#session.cashrole=='supervisor'}">
				
				<table align="center" border="1" width="100%">
					<tr>
						<td id="linktitle"> Supervisor Only </td>
					</tr>
					<tr align="center">
						<td><a href="SuperNewUser"> Create New User </a> </td>
					</tr>
					<tr align="center">
						<td><a href="SuperRemoveUser"> Delete User </a> </td>
					</tr>
					<tr align="center">
						<td><a href="SuperNewCashier"> Create New Cashier </a> </td>
					</tr>
		
					<tr align="center">
						<td><a href="SuperRemoveCashier"> Delete Cashier </a> </td>
					</tr>
					
					<tr align="center">
						<td><a href="SuperBulkPromotion"> Bulk Promotion </a> </td>
					</tr>
					
					<tr align="center">
						<td><a href="CashierChangeYear"> Switch to Next Academic Year</a>
					</tr>
					
					
				</table><br>
				  </s:if>		
						
					</div>
		
		</div>
</div>
</div>
</body>
</html>
