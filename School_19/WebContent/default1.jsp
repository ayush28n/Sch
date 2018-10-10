<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<style>
#fulldiv{
height: 100%;
    width: 1050px;
    ///background-color: blue;
    margin: auto;
}
#leftdiv{
    height: 625px;
    width: 18%;
    //background-color: powderblue;
	//background-color: #e4e4e4;
	float:left;
	
}
#centerdiv{
    height: 625px;
    width: 64%;
   // background-color: white;
	float:left;
	}
	
#rightdiv{
    height: 625px;
    width: 18%;
    //background-color: powderblue;
	//background-color: #e4e4e4;
	float:left;
}
#headerdiv
{
//background-color: #D3D3D3;
 height: 115px;
 font-family: Verdana;
 color: #000099;
 font-size: 5;
 text-align: center;
 border-style: ridge;
}

#contentdiv
{ 
//background-color: #F5F5F5;
 min-height: 500px;
 padding-left: 20px;
 padding-right: 20px;
// border-style: ridge;
    //font-family: "Segoe UI",Arial,sans-serif;
    font-family: "Poppins-Regular",Arial,sans-serif;
}

#logodiv
{
//background-color: #C0C0C0;
//background-color: #F5F5F5;
height: 160px;
//font-family: Verdana;
font-family: "Poppins-Regular",Arial,sans-serif;
font-size: 14px;

}

#logoutdiv
{
//background-color: #F5F5F5;
//background-color: #C0C0C0;
height: 120px;
//font-family: Verdana;
font-family: "Poppins-Regular",Arial,sans-serif;
font-size: 14px;

}

#leftlink
{
align: center;
}
#rightlink
{
margin-top:5px;
align: center;
}


a{
color: #566FB3;
font-family: Arial;
font-weight: bold;
text-decoration: none;
font-size: 12px;
}

a:hover{
text-decoration: underline;
}

#linktitle{
	color: #333366;
    text-align: left;
    padding: 0px;
    white-space: normal;
    overflow: hidden;
	font-size: 12px;
	font-family: Verdana;  //Helvetica, sans-serif,Verdana;
	font-weight: bold;
	background-color: #e4e4e4;
}

#schoolmanag{
margin-top: 0px;
}

#schoolname{
margin-bottom: 0px;
margin-top: 7px;
}

#managedcontent{
float:left;
border-style: solid;
padding: 5px;
margin:5px;
}
#contentform{
float:center;
margin:100px;

}
#logo{
margin-top: 10px;
margin-left: 10px;
margin-right: 10px;
}

#SchoolLogo
{
	float: left;
	margin-left: 30px;
	margin-top: 5px;
}
#SchoolName
{
	float: left;
	margin-left: 28px;
	margin-top: 5px;
}

tr:hover {background-color:#f5f5f5;}

</style>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>School Management</title>
</head>
<body background="images/bg1.jpg">
<div id="fulldiv">

		<div id="leftdiv">
			<div id="logodiv">
			<div id="logo">
			<img src="images/logom.png" alt="logo" height="78" width="175"/>
			</div>
			<p align="center"><b>Welcome, <br><s:property value="#session.NameOfUser"/></b></p>
				<table width="100%">	
					<tr align="center">
						<td><a href="UserChangePassword"> Change Password</a> </td>
					</tr>
			</table>
			
			</div>
			
			<div id="leftlink">
				<br>	
				<table align="center" border="1" width="100%">
					<tr>
						<td id="linktitle"> Tools </td>
					</tr>
					<tr align="center">
						<td><a href="CashierLogin"> Cashier Login</a> </td>
					</tr>
				</table><br>
				
				<table align="center" border="1" width="100%">
					<tr>
						<td id="linktitle"> Student </td>
					</tr>
					
					<tr align="center">
						<td><a href="admform"> Admit New Student</a> </td>
					</tr>
					
					<tr align="center">
						<td><a href="SearchStudent"> Search Student</a> </td>
					</tr>
					
					<tr align="center">
						<td><a href="ClassWiseList"> Generate Class wise List</a></td>
					</tr>
					
					<tr align="center">
						<td><a href="GetAdmList"> Latest Admission List</a></td>
					</tr>	
					
					
					<tr align="center">
						<td><a href="EditStudentDetails"> Edit Student Details</a></td>
					</tr>
					
					
					<tr align="center">
						<td><a href="CurrentSchoolStrength"> Current School Strength</a></td>
					</tr>
				</table><br>
					
				
				
				
					
			</div>
			
		
		</div>