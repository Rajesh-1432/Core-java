package model;

public class Emp1 {
	int eid;
	String ename;
	double esal;
	Emp1(){
		
	}
	public Emp1(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public double getEsal() {
		return esal;
	}
	
}
