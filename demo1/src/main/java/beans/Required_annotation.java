package beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Required_annotation {
int sid;
String sname;
String scourse;
@Required

public void setSid(int sid) {
	this.sid = sid;
}
@Required
@Value("Rajesh")
public void setSname(String sname) {
	this.sname = sname;
}
@Required
@Value("FSD-Java")
public void setScourse(String scourse) {
	this.scourse = scourse;
}
public void show() {
	System.out.println("Student Name::"+sname);
	System.out.println("Student ID::"+sid);
	System.out.println("Student Course::"+scourse);
}
}
