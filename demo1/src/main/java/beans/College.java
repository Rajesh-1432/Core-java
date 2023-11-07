package beans;

import java.util.Iterator;

public class College {
String cname;
Student st;
public void setCname(String cname) {
	this.cname = cname;
}
public void setSt(Student st) {
	this.st = st;
}
public void CollegeInfo() {
	System.err.println("College_Name::"+cname);
	System.out.println("Student_Name::"+st.getSname());
	System.out.println("Fee::"+st.fee);
	System.out.println("Courses::");
	String [] str2=st.getCourses();
	for(int i=0;i<str2.length;i++) {
		System.out.print(str2[i]);
	}
	
}

}
