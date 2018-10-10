package p1;


import java.time.LocalDate;


public class CashierFeeConfirm 
{
	int admn,TotalJune;
	private String NameOfStudent,Place,Fname,Cls,duefrom,transduefrom,TutionFromMonthString,TransFromMonthString,ToTutionMonthString,ToTransMonthString;
	private String CollectAdmission="habuda",CollectAnnual="habuda";
	private Float Outstanding,AnnFees,AdmFees,TransFees,TutionFees,TotalTutionFees,TotalTransFees,TotalAmount,Discount;
	private long TransMonth,TutionMonth;
	LocalDate TransDueFrom,TutionDueFrom,TutionToFinal,TransToFinal;
	
	public String execute() 
	{
		TutionDueFrom = LocalDate.parse(duefrom);
		TransDueFrom = LocalDate.parse(transduefrom);
		TutionFromMonthString = TutionDueFrom.getMonth().name() + ", "+TutionDueFrom.getYear();
		TransFromMonthString = TransDueFrom.getMonth().name() + ", "+TransDueFrom.getYear();
		TutionToFinal = TutionDueFrom.plusMonths(TutionMonth-1);
		
		LocalDate TransSemiFinal = TransDueFrom.plusMonths(TransMonth-1);
		
		
		LocalDate TransDueFromCopy = TransDueFrom;
		TotalJune = 0;
		while(TransSemiFinal.isAfter(TransDueFromCopy) || TransSemiFinal.isEqual(TransDueFromCopy))
		{
			System.out.println("chal");
			int MonthVal = TransDueFromCopy.getMonthValue();
				if(MonthVal == 6)
				{
					TotalJune++;
				}
			TransDueFromCopy = TransDueFromCopy.plusMonths(1);
		}	
		
		TransToFinal = TransDueFrom.plusMonths(TransMonth-1+TotalJune);
		
		ToTutionMonthString = TutionToFinal.getMonth().name() + ", "+TutionToFinal.getYear();
		ToTransMonthString = TransToFinal.getMonth().name() + ", "+TransToFinal.getYear();
		
		if(TransMonth == 0)
		{
			ToTransMonthString = "------";
			TransFromMonthString = "------";
		}
		
		if(TutionMonth == 0)
		{
			ToTutionMonthString = "------";
			TutionFromMonthString = "------";
		}
		
		if(CollectAdmission.equals("yes"))
		{
			System.out.println("Collecting Admission Fees");
		}
		else
		{
			AdmFees = 0.0f;
		}
		
		if(CollectAnnual.equals("yes"))
		{
			System.out.println("Collecting Annual Fees");
		}
		else
		{
			AnnFees = 0.0f;
		}
		
		
		System.out.println(AnnFees);
		System.out.println(AdmFees);
		TotalTutionFees = TutionFees * TutionMonth;
		TotalTransFees = TransFees * TransMonth;
		System.out.println(TotalTutionFees);
		System.out.println(TotalTransFees);
		
		TotalAmount = AnnFees+AdmFees+(TotalTutionFees)+(TotalTransFees)+Outstanding-Discount;
		
		System.out.println(duefrom);
		System.out.println(transduefrom);
	return "success";
	}
	public int getTotalJune() {
		return TotalJune;
	}

	public void setTotalJune(int totalJune) {
		TotalJune = totalJune;
	}

	public String getCollectAdmission() {
		return CollectAdmission;
	}

	public void setCollectAdmission(String collectAdmission) {
		CollectAdmission = collectAdmission;
	}

	

	public String getCollectAnnual() {
		return CollectAnnual;
	}

	public void setCollectAnnual(String collectAnnual) {
		CollectAnnual = collectAnnual;
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

	public Float getTransFees() {
		return TransFees;
	}

	public void setTransFees(Float transFees) {
		TransFees = transFees;
	}
	
}
