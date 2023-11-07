package beans;

public class Emp {

	int eid;
	String ename;
	double esal;
	public void setEid(int eid) {
		this.eid=eid;
	
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public void setEsal(double esal) {
		this.esal=esal;
	}
	public void empInfo() {
		System.out.println("Eid::"+eid);
		System.out.println("Ename::"+ename);
		System.out.println("Esal::"+esal);
		
	}
}

