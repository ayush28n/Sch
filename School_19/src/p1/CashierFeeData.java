package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class CashierFeeData 
{
	int admn,TotalJune;
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	private String NameOfStudent,Place,Fname,Cls,duefrom,transduefrom,TutionFromMonthString,ToMonthString,TransFromMonthString;
	private Float Outstanding,AnnFees,AdmFees,TutionFees,TransFees,TotalAmount,TotalTutionFees,TotalTransFees;
	private LocalDate TutionDueFrom,TransDueFrom,CurrentDate ;
	private long TransMonthBetween,TutionMonthBetween;
	private ArrayList<Integer> TransMonthList,TutionMonthList;
	int tutiondisc,transdisc;




	public String execute() 
	{
		try 
		{
			TutionMonthList =  new ArrayList<Integer>();
			TransMonthList = new ArrayList<Integer>();
			Connection con = SingletonDB.getCon();
			ps1= con.prepareStatement("select * from current");
			ps2= con.prepareStatement("select name,place,fname,class,duefrom,outstanding,transduefrom,admfees,annfees,tutiondisc,transdisc from students where admn = ?");
			ps3= con.prepareStatement("select * from tutionfee where class=?");
			ps4= con.prepareStatement("select * from places where name=?");
			
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1.next())
			{
				String cdate = rs1.getString("cdate");
				CurrentDate = LocalDate.parse(cdate);
				System.out.println(CurrentDate);
			}
			
			ps2.setInt(1,admn);
			ResultSet rs2 = ps2.executeQuery();
			
			if(rs2.next())
			{
				System.out.println("rs2 Start");
				NameOfStudent = rs2.getString("name");
				Place = rs2.getString("place");
				Fname = rs2.getString("fname");
				Cls = rs2.getString("class");
				Outstanding = rs2.getFloat("outstanding");
				AdmFees = rs2.getFloat("admfees");
				AnnFees = rs2.getFloat("annfees");
				duefrom = rs2.getString("duefrom");
				TutionDueFrom = LocalDate.parse(duefrom);
				transduefrom = rs2.getString("transduefrom");
				TransDueFrom = LocalDate.parse(transduefrom);
				tutiondisc = rs2.getInt("tutiondisc");
				transdisc = rs2.getInt("transdisc");
			}
			
			ps3.setString(1,Cls);
			ResultSet rs3 = ps3.executeQuery();
			if(rs3.next())
			{
				System.out.println("rs3 Start");
				System.out.println(Cls);
				TutionFees = rs3.getFloat("fees");
				//TutionFeesDiscount
				TutionFees = TutionFees * (100-tutiondisc)/100;
			}
			
			
			ps4.setString(1,Place);
			ResultSet rs4 = ps4.executeQuery();
			
			if(rs4.next())
			{
				System.out.println("rs4start");
				TransFees = rs4.getFloat("fees");
				//TransFeesDiscount
				TransFees = TransFees * (100-transdisc)/100;
			}
			TutionMonthBetween = ChronoUnit.MONTHS.between(TutionDueFrom,CurrentDate)+1;
			System.out.println("here");
			LocalDate TransDueFromCopy = TransDueFrom;
			TotalJune = 0;
			while(CurrentDate.isAfter(TransDueFromCopy) || CurrentDate.isEqual(TransDueFromCopy))
			{
				System.out.println("chal");
				int MonthVal = TransDueFromCopy.getMonthValue();
					if(MonthVal == 6)
					{
						TotalJune++;
					}
				TransDueFromCopy = TransDueFromCopy.plusMonths(1);
			}	
			System.out.println("TotalJuneisEqualTo");
			System.out.println(TotalJune);
			
			TransMonthBetween = ChronoUnit.MONTHS.between(TransDueFrom,CurrentDate)+1-TotalJune;
			
			System.out.println("here");
			System.out.println(AnnFees);
			System.out.println(AdmFees);
			System.out.println(TutionFees);
			System.out.println(TutionMonthBetween);
			System.out.println(TransFees);
			System.out.println(TransMonthBetween);
			System.out.println(Outstanding);
			
			
			System.out.println("this....");
			TutionFromMonthString = TutionDueFrom.getMonth().name() + ", "+TutionDueFrom.getYear();
			ToMonthString = CurrentDate.getMonth().name() + ", "+CurrentDate.getYear();
			TransFromMonthString = TransDueFrom.getMonth().name() + ", "+TransDueFrom.getYear();
			
			for(int i=0;i<=TutionMonthBetween+6;i++)
			{
				System.out.println("that..");
				System.out.println("TutionMonthBetween");
				System.out.println(i);
				TutionMonthList.add(i);
				System.out.println(i);
			}
			
			for(int j=0;j<=TransMonthBetween+6;j++)
			{
				System.out.println("TransnMonthBetween");
				TransMonthList.add(j);
			}
			
			TotalTutionFees = (TutionFees * TutionMonthBetween);
			TotalTransFees = (TransFees * TransMonthBetween);
			
			TotalAmount = AnnFees+AdmFees+(TotalTutionFees)+(TotalTransFees)+Outstanding;
			
			return "success";
		}
			
		catch(Exception e)
		{
			System.out.println(e);
			return "error";
		}	
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

	public int getAdmn() {
		return admn;
	}

	public void setAdmn(int admn) {
		this.admn = admn;
	}
	
	
	

	public ArrayList<Integer> getTransMonthList() {
		return TransMonthList;
	}

	public void setTransMonthList(ArrayList<Integer> transMonthList) {
		TransMonthList = transMonthList;
	}

	public ArrayList<Integer> getTutionMonthList() {
		return TutionMonthList;
	}

	public void setTutionMonthList(ArrayList<Integer> tutionMonthList) {
		TutionMonthList = tutionMonthList;
	}

	public String getTransFromMonthString() {
		return TransFromMonthString;
	}

	public void setTransFromMonthString(String transFromMonthString) {
		TransFromMonthString = transFromMonthString;
	}

	public String getTutionFromMonthString() {
		return TutionFromMonthString;
	}

	public void setTutionFromMonthString(String tutionFromMonthString) {
		TutionFromMonthString = tutionFromMonthString;
	}

	public String getToMonthString() {
		return ToMonthString;
	}

	public void setToMonthString(String tutionToMonthString) {
		ToMonthString = tutionToMonthString;
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

	public Float getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		TotalAmount = totalAmount;
	}

	public long getTransMonthBetween() {
		return TransMonthBetween;
	}

	public void setTransMonthBetween(long transMonthBetween) {
		TransMonthBetween = transMonthBetween;
	}

	public long getTutionMonthBetween() {
		return TutionMonthBetween;
	}

	public void setTutionMonthBetween(long tutionMonthBetween) {
		TutionMonthBetween = tutionMonthBetween;
	}

	public String getNameOfStudent() {
		return NameOfStudent;
	}

	public void setNameOfStudent(String nameOfStudent) {
		NameOfStudent = nameOfStudent;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getCls() {
		return Cls;
	}

	public void setCls(String cls) {
		Cls = cls;
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

	public Float getTutionFees() {
		return TutionFees;
	}

	public void setTutionFees(Float tutionFees) {
		TutionFees = tutionFees;
	}

	public Float getTransFees() {
		return TransFees;
	}

	public void setTransFees(Float transFees) {
		TransFees = transFees;
	}

	public LocalDate getCurrentDate() {
		return CurrentDate;
	}

	public void setCurrentDate(LocalDate currentDate) {
		CurrentDate = currentDate;
	}

	public int getTutiondisc() {
		return tutiondisc;
	}

	public void setTutiondisc(int tutiondisc) {
		this.tutiondisc = tutiondisc;
	}

	public int getTransdisc() {
		return transdisc;
	}

	public void setTransdisc(int transdisc) {
		this.transdisc = transdisc;
	}

	
}
