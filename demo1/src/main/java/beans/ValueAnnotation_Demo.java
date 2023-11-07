package beans;

import org.springframework.beans.factory.annotation.Value;

public class ValueAnnotation_Demo {
	//field level
	//@Value("Rajesh")
	String tname;
	//@Value("Computer Science")
String tsub;
//	@Value("GDC-TKL")
String cname;
	//@Value("MCA")
String tqualifie;
@Value("Rajesh")
public void setTname(String tname) {
	this.tname = tname;
}
@Value("Computer Science")
public void setTsub(String tsub) {
	this.tsub = tsub;
}
@Value("GDC-TKL")
public void setCname(String cname) {
	this.cname = cname;
}
@Value("MCA")
public void setTqualifie(String tqualifie) {
	this.tqualifie = tqualifie;
}
public void show() {
	System.out.println("Name of The teacher::"+tname);
	System.out.println("Subject::"+tsub);
	System.out.println("Qualification::"+tqualifie);
	System.out.println("Colege Name::"+cname);
	
}
}
