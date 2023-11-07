package beans;

public class Student {
String sname;
String [] courses;
double fee;
public void setCourses(String[] courses) {
	this.courses = courses;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String[] getCourses() {
	return courses;
}
public String getSname() {
	return sname;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
}
