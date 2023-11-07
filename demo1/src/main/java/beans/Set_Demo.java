package beans;

import java.util.Iterator;
import java.util.Set;

public class Set_Demo {
Set company;
public void setCompany(Set company) {
	this.company = company;
}
public void show() {
	Iterator it=company.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
