package p1;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;


public class CashierFeeReceipt 
{
	
	int receiptno,admn;
	String name,date,time,tutionfromto,transfromto,ifadmission,ifannual,ifoutstanding,ifdiscount,iftution,iftransport,fname,cls;
	Float annual,admission,tution,transport,outstanding,total,discount;
	PreparedStatement ps,ps1;
	Connection con = SingletonDB.getCon();
	
	
	
	public String getIfadmission() {
		return ifadmission;
	}



	public void setIfadmission(String ifadmission) {
		this.ifadmission = ifadmission;
	}



	public String getIfannual() {
		return ifannual;
	}



	public void setIfannual(String ifannual) {
		this.ifannual = ifannual;
	}



	public String getIfoutstanding() {
		return ifoutstanding;
	}



	public void setIfoutstanding(String ifoutstanding) {
		this.ifoutstanding = ifoutstanding;
	}



	public String getIfdiscount() {
		return ifdiscount;
	}



	public void setIfdiscount(String ifdiscount) {
		this.ifdiscount = ifdiscount;
	}



	public String getIftution() {
		return iftution;
	}



	public void setIftution(String iftution) {
		this.iftution = iftution;
	}



	public String getIftransport() {
		return iftransport;
	}



	public void setIftransport(String iftransport) {
		this.iftransport = iftransport;
	}



	public Float getDiscount() {
		return discount;
	}



	public void setDiscount(Float discount) {
		this.discount = discount;
	}



	public int getReceiptno() {
		return receiptno;
	}



	public void setReceiptno(int receiptno) {
		this.receiptno = receiptno;
	}



	public int getAdmn() {
		return admn;
	}



	public void setAdmn(int admn) {
		this.admn = admn;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getTutionfromto() {
		return tutionfromto;
	}



	public void setTutionfromto(String tutionfromto) {
		this.tutionfromto = tutionfromto;
	}



	public String getTransfromto() {
		return transfromto;
	}



	public void setTransfromto(String transfromto) {
		this.transfromto = transfromto;
	}



	public Float getAnnual() {
		return annual;
	}



	public void setAnnual(Float annual) {
		this.annual = annual;
	}



	public Float getAdmission() {
		return admission;
	}



	public void setAdmission(Float admission) {
		this.admission = admission;
	}



	public Float getTution() {
		return tution;
	}



	public void setTution(Float tution) {
		this.tution = tution;
	}



	public Float getTransport() {
		return transport;
	}



	public void setTransport(Float transport) {
		this.transport = transport;
	}



	public Float getOutstanding() {
		return outstanding;
	}



	public void setOutstanding(Float outstanding) {
		this.outstanding = outstanding;
	}



	public Float getTotal() {
		return total;
	}



	public void setTotal(Float total) {
		this.total = total;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getCls() {
		return cls;
	}



	public void setCls(String cls) {
		this.cls = cls;
	}



	public String execute() 
	{
		try 
		{
			ps= con.prepareStatement("select * from receipt where receiptno = ?");
			ps1 = con.prepareStatement("select fname,class from students where admn = ?");
			ps.setInt(1,receiptno);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				{
				admn = rs.getInt("admn");
				name = rs.getString("name");
				date = rs.getString("date");
				time = rs.getString("time");
				tutionfromto = rs.getString("tutionfromto");
				transfromto = rs.getString("transfromto");
				annual = rs.getFloat("annual");
				admission = rs.getFloat("admission");
				tution = rs.getFloat("tution");
				transport = rs.getFloat("transport");
				outstanding = rs.getFloat("outstanding");
				total=rs.getFloat("total");
				discount=rs.getFloat("discount");
				
				
				if(annual>0.0)
				{
					System.out.println(annual>=0.0);
					System.out.println(annual>=0);
					System.out.println("annual");
					ifannual = "yes";
				}
				if(admission>0.0)
				{
					ifadmission = "yes";
				}
				if(transport>0.0)
				{
					iftransport="yes";
				}
				if(tution>0.0)
				{
					iftution="yes";
				}
				if(outstanding>0.0)
				{
					ifoutstanding="yes";
				}
				if(discount>0.0)
				{
					ifdiscount="yes";
				}
			}
			
			ps1.setInt(1, admn);
			System.out.println("hee");
			ResultSet rs1 = ps1.executeQuery();
			if(rs1.next())
			{
				fname = rs1.getString(1);
				cls = rs1.getString(2);
			}
			System.out.println(admn);
			System.out.println(receiptno);
			System.out.println(ifadmission);
			System.out.println(admission);
			System.out.println(ifannual);
			System.out.println(annual);
			System.out.println(iftution);
			System.out.println(outstanding);
		}
		
		catch(Exception e)
		{
			
		}
		return "success";
	}	
}
