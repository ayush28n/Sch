package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class FeeDueListPlaceWise 
{
	String from,to,whichclass;
	int admn,TotalJune;
	long mob;
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	private String NameOfStudent,CurrentDateString,Place,Fname,cls,duefrom,transduefrom,TutionFromMonthString,ToMonthString,TransFromMonthString,nowtime;
	private Float Outstanding,AnnFees,AdmFees,TutionFees,TransFees,TotalAmount,TotalTutionFees,TotalTransFees;
	private LocalDate TutionDueFrom,TransDueFrom,CurrentDate ;
	private long TransMonthBetween,TutionMonthBetween;
	private ArrayList<Integer> TransMonthList,TutionMonthList;
	String month,year,monthString;
	ArrayList<FeeDueDAO> FeeList=new ArrayList<FeeDueDAO>();
	int tutiondisc,transdisc;
	private LocalDate ld;

	
	public String execute() 
	{
		try 
		{
			CurrentDateString = year+"-"+month+"-01";
			CurrentDate = LocalDate.parse(CurrentDateString);
			ld = LocalDate.now();
			nowtime= ld.toString();
			monthString = CurrentDate.getMonth().name();
			TutionMonthList =  new ArrayList<Integer>();
			TransMonthList = new ArrayList<Integer>();
			Connection con = SingletonDB.getCon();
			ps2= con.prepareStatement("select admn,name,class,duefrom,outstanding,transduefrom,admfees,annfees,mob,tutiondisc,transdisc from students where place = ? order by name");
			ps3= con.prepareStatement("select * from tutionfee where class=?");
			ps4= con.prepareStatement("select * from places where name=?");
			ps2.setString(1,Place);
			ResultSet rs2 = ps2.executeQuery();
			
	while(rs2.next())
	{
				System.out.println("rs2 Start");
				admn = rs2.getInt("admn");
				NameOfStudent = rs2.getString("name");
				cls = rs2.getString("class");
				Outstanding = rs2.getFloat("outstanding");
				AdmFees = rs2.getFloat("admfees");
				AnnFees = rs2.getFloat("annfees");
				duefrom = rs2.getString("duefrom");
				TutionDueFrom = LocalDate.parse(duefrom);
				transduefrom = rs2.getString("transduefrom");
				mob=rs2.getLong("mob");
				TransDueFrom = LocalDate.parse(transduefrom);
				tutiondisc = rs2.getInt("tutiondisc");
				transdisc = rs2.getInt("transdisc");
	
			
			ps3.setString(1,cls);
			ResultSet rs3 = ps3.executeQuery();
			if(rs3.next())
			{
				System.out.println("rs3 Start");
				System.out.println(cls);
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
			
			
			TotalAmount = AnnFees+AdmFees+(TutionFees*TutionMonthBetween)+(TransFees*TransMonthBetween)+Outstanding;
			
			TutionFromMonthString = TutionDueFrom.getMonth().name() + ", "+TutionDueFrom.getYear();
			TransFromMonthString = TransDueFrom.getMonth().name() + ", "+TransDueFrom.getYear();
			
			
			
			TotalTutionFees = TutionFees * TutionMonthBetween;
			TotalTransFees = TransFees * TransMonthBetween;
			if(TotalAmount>0)
			{
			FeeDueDAO ob=new FeeDueDAO();
			ob.setAdmission(AdmFees);
			ob.setAdmn(admn);
			ob.setAnnual(AnnFees);
			ob.setCls(cls);
			ob.setMob(mob);
			ob.setName(NameOfStudent);
			ob.setOutstanding(Outstanding);
			ob.setPlace(Place);
			ob.setTotal(TotalAmount);
			ob.setTotaltrans(TotalTransFees);
			ob.setTotaltution(TotalTutionFees);
			FeeList.add(ob);
			}
			System.out.println("habuda habuda habuda");
			System.out.println(FeeList);
	}		
			return "success";
		}
			
		catch(Exception e)
		{
			System.out.println(e);
			return "error";
		}	
	}


	
	
	

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public ArrayList<FeeDueDAO> getFeeList() {
		return FeeList;
	}
	
	public void setFeeList(ArrayList<FeeDueDAO> feeList) {
		FeeList = feeList;
	}

	public String getNowtime() {
		return nowtime;
	}

	public void setNowtime(String nowtime) {
		this.nowtime = nowtime;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getWhichclass() {
		return whichclass;
	}

	public void setWhichclass(String whichclass) {
		this.whichclass = whichclass;
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
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
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
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}






	public String getMonthString() {
		return monthString;
	}






	public void setMonthString(String monthString) {
		this.monthString = monthString;
	}
	
}
