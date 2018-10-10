package p1;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


public class CashierFeeFinal 
{
	int admn,TotalJune;
	private String NameOfStudent,duefrom,transduefrom,TutionFromMonthString,TransFromMonthString,ToTutionMonthString,ToTransMonthString;
	private Float Outstanding,AnnFees,AdmFees,TransFees,TutionFees,TotalTutionFees,TotalTransFees,TotalAmount,Discount;
	private long TransMonth,TutionMonth;
	LocalDate TransDueFrom,TutionDueFrom,TutionToFinal,TransToFinal;
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	LocalDate NewTutionDue;
	LocalDate NewTransDue;
	String NewTutionDueString;
	String NewTransDueString;
	String TutionFromTo,TransFromTo;
	int PreviousReceiptNo = 0,ReceiptNo = 0;
	HttpSession sesscash = ServletActionContext.getRequest().getSession();
	
	public String execute() 
	{
		try 
		{
			TutionDueFrom = LocalDate.parse(duefrom);
			TransDueFrom = LocalDate.parse(transduefrom);
			
			NewTutionDue = TutionDueFrom.plusMonths(TutionMonth);
			NewTransDue = TransDueFrom.plusMonths(TransMonth+TotalJune);
			NewTutionDueString = NewTutionDue.toString();
			NewTransDueString = NewTransDue.toString();
			
			Connection con = SingletonDB.getCon();
			
			ps1= con.prepareStatement("update students set duefrom=?,transduefrom=?,admfees = admfees - ?,annfees = annfees-?, outstanding = outstanding-? where admn=?");
			ps1.setString(1,NewTutionDueString);
			ps1.setString(2,NewTransDueString);
			ps1.setFloat(3,AdmFees);
			ps1.setFloat(4,AnnFees);
		
			ps1.setFloat(5, Outstanding);
			ps1.setInt(6, admn);
			
			ps2= con.prepareStatement("select * from receipt ORDER BY receiptno DESC limit 1");
			ResultSet rs2 = ps2.executeQuery();
			if(rs2.next())
			{
			 PreviousReceiptNo = rs2.getInt("receiptno");
			}
			ReceiptNo = PreviousReceiptNo+1;
			
			LocalDate ld = LocalDate.now();
			String ldstring= ld.toString();
			LocalTime lt = LocalTime.now();
			String ltstring = lt.toString();
			TutionFromTo = TutionFromMonthString + " to " + ToTutionMonthString;
			TransFromTo = TransFromMonthString + " to " + ToTransMonthString;
			String CashierID = (String) sesscash.getAttribute("CashierID");
			ps3= con.prepareStatement("insert into receipt (receiptno,admn,name,date,time,annual,admission,tution,tutionfromto,transport,transfromto,outstanding,total,discount,cashier) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			ps3.setInt(1,PreviousReceiptNo+1);
			ps3.setInt(2,admn);
			ps3.setString(3,NameOfStudent);
			ps3.setString(4,ldstring);
			ps3.setString(5, ltstring);

			ps3.setFloat(6, AnnFees);

			ps3.setFloat(7, AdmFees);
			ps3.setFloat(8, TotalTutionFees);
			ps3.setString(9, TutionFromTo);
			ps3.setFloat(10, TotalTransFees);
			ps3.setString(11, TransFromTo);
			ps3.setFloat(12, Outstanding);
			ps3.setFloat(13,TotalAmount);
			ps3.setFloat(14,Discount);
			ps3.setString(15,CashierID);
			ps3.executeUpdate();
			ps1.executeUpdate();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	return "success";
	}

	public int getTotalJune() {
		return TotalJune;
	}

	public void setTotalJune(int totalJune) {
		TotalJune = totalJune;
	}

	public int getReceiptNo() {
		return ReceiptNo;
	}

	public void setReceiptNo(int receiptNo) {
		ReceiptNo = receiptNo;
	}

	public String getDuefrom() {
		return duefrom;
	}

	public void setDuefrom(String duefrom) {
		this.duefrom = duefrom;
	}

	public String getTransduefrom() {
		return transduefrom;
	}

	public void setTransduefrom(String transduefrom) {
		this.transduefrom = transduefrom;
	}

	public Float getDiscount() {
		return Discount;
	}

	public void setDiscount(Float discount) {
		Discount = discount;
	}

	public Float getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		TotalAmount = totalAmount;
	}

	public long getTransMonth() {
		return TransMonth;
	}

	public void setTransMonth(long transMonth) {
		TransMonth = transMonth;
	}

	public long getTutionMonth() {
		return TutionMonth;
	}

	public void setTutionMonth(long tutionMonth) {
		TutionMonth = tutionMonth;
	}

	public String getTutionFromMonthString() {
		return TutionFromMonthString;
	}

	public void setTutionFromMonthString(String tutionFromMonthString) {
		TutionFromMonthString = tutionFromMonthString;
	}

	public String getTransFromMonthString() {
		return TransFromMonthString;
	}

	public void setTransFromMonthString(String transFromMonthString) {
		TransFromMonthString = transFromMonthString;
	}

	public String getToTutionMonthString() {
		return ToTutionMonthString;
	}

	public void setToTutionMonthString(String toTutionMonthString) {
		ToTutionMonthString = toTutionMonthString;
	}

	public String getToTransMonthString() {
		return ToTransMonthString;
	}

	public void setToTransMonthString(String toTransMonthString) {
		ToTransMonthString = toTransMonthString;
	}

	public Float getTutionFees() {
		return TutionFees;
	}

	public void setTutionFees(Float tutionFees) {
		TutionFees = tutionFees;
	}

	public Float getTotalTutionFees() {
		return TotalTutionFees;
	}

	public void setTotalTutionFees(Float totalTutionFees) {
		TotalTutionFees = totalTutionFees;
	}

	public Float getTotalTransFees() {
		return TotalTransFees;
	}

	public void setTotalTransFees(Float totalTransFees) {
		TotalTransFees = totalTransFees;
	}

	
	public int getAdmn() {
		return admn;
	}

	public void setAdmn(int admn) {
		this.admn = admn;
	}
	
	
	

	

	public String getNameOfStudent() {
		return NameOfStudent;
	}

	public void setNameOfStudent(String nameOfStudent) {
		NameOfStudent = nameOfStudent;
	}

	
	public Float getOutstanding() {
		return Outstanding;
	}

	public void setOutstanding(Float outstanding) {
		Outstanding = outstanding;
	}

	public Float getAnnFees() {
		return AnnFees;
	}

	public void setAnnFees(Float annFees) {
		AnnFees = annFees;
	}

	public Float getAdmFees() {
		return AdmFees;
	}

	public void setAdmFees(Float admFees) {
		AdmFees = admFees;
	}

	

	public Float getTransFees() {
		return TransFees;
	}

	public void setTransFees(Float transFees) {
		TransFees = transFees;
	}
}
