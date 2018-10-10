<div class="invoice-box">


        <tr class="information">
                <td colspan="2">
                    <table>
                        <tr>
                            <td align="left">
                                Happy Public School<br>
                                Chauroli Road<br>
                                Jewar - 203135
                            </td>
                            <td>
                            <div id = "SchoolLogo">
					<img src="images/happy-1.png" alt="logo" height="90" width="112"/>
					</div>
                            </td>
                            <td align="right">
                                Receipt #: <s:property value="receiptno"/><br>
                                Payment Date: <s:property value="date"/><br>
                                Payment Time: <s:property value="time"/><br>
                                <b>DUPLICATE RECEIPT</b>
                            </td>
                            
                           
                        </tr>
                    </table>
                </td>
            </tr>
        
        
      <div style="float: left"> <b> Student Name: <s:property value="name"/> </b> <br>  <b> Father's Name: <s:property value="fname"/> </div>
      <div style="float: right"><b> Admission No: <s:property value="admn"/> </b> <br> </b>  <b> Class: <s:property value="cls"/> </b> </div> 
          
        
        <table cellpadding="0" cellspacing="0">
            <tr class="top">
                <td colspan="2">
                    <table>
                        <tr>
                            <!--  <td class="title">
                                <img src="https://www.sparksuite.com/images/logo.png" style="width:100%; max-width:300px;">
                            </td> -->
                            
                            
                        </tr>
                    </table>
                </td>
            </tr>
            
            
            

            <tr class="heading">
                <td>
                    Payment Details
                </td>
                
               
                
                <td>
                    Amount
                </td>
            </tr>
          
         
          
            
     		<s:if test="%{ifadmission=='yes'}">

			
            
            <tr class="item">
                <td>
                  <b>  Admission Fees </b>
                </td>
                
                <td>
                   <s:property value="admission"/>
                </td>
            </tr>
           
            </s:if>
            
            <s:if test="%{ifannual=='yes'}">
            
            	 <tr class="item">
                	<td>
                   	 <b>	Annual Fees </b>
               		 </td>
                
               		 <td>
                   		<s:property value="annual"/>
                	</td>
            	</tr>
           
            </s:if>
            
            <s:if test="%{iftution=='yes'}">
            
            	 <tr class="item">
                	<td>
                   	 	<b>Tution Fees</b> ( <s:property value="tutionfromto"/> )
               		 </td>
                
               		 <td>
                   		<s:property value="tution"/>
                	</td>
            	</tr>
           
            </s:if>
            
            <s:if test="%{iftransport=='yes'}">
            
            	 <tr class="item">
                	<td>
                   	 <b>Transport Fees </b> ( <s:property value="transfromto"/> )
               		 </td>
                
               		 <td>
                   		<s:property value="transport"/> 
                	</td>
            	</tr>
           
            </s:if>
            
            <s:if test="%{ifoutstanding=='yes'}">
            
            	 <tr class="item">
                	<td>
                   	 <b>	Outstanding Fees </b>
               		 </td>
                
               		 <td>
                   		<s:property value="outstanding"/>
                	</td>
            	</tr>
           
            </s:if>
            
            <s:if test="%{ifdiscount=='yes'}">
            
            	 <tr class="item">
                	<td>
                   	 <b>	Discount </b>
               		 </td>
                
               		 <td>
                   		- <s:property value="discount"/>
                	</td>
            	</tr>
           
            </s:if>
           
            
            
            <tr class="total">
                <td></td>
                
                <td>
                   Total: <s:property value="total"/>
                </td>
            </tr>
        </table>
        </div>